package org.g5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser.ActivationContext;
import org.g5.parser.GrammarParser.AssignmentContext;
import org.g5.parser.GrammarParser.ExpressionContext;
import org.g5.parser.GrammarParser.IdContext;
import org.g5.parser.GrammarParser.IntContext;
import org.g5.parser.GrammarParser.LinearLayerContext;
import org.g5.parser.GrammarParser.ReluContext;
import org.g5.parser.GrammarParser.SequentialContainerContext;
import org.g5.parser.GrammarParser.SigmoidContext;
import org.g5.parser.GrammarParser.TanhContext;
import org.g5.util.Logger;

public class Visitor extends GrammarBaseVisitor<Object> {
    private ValueTable table = new ValueTable();

    @Override
    public Object visitAssignment(AssignmentContext ctx) {
        String id = null;
        Object value = null;

        Class<?> expectedType = IdContext.class;
        for (ParseTree tree : ctx.children) {
            if (tree.getClass().equals(TerminalNodeImpl.class))
                continue;

            if (expectedType.equals(tree.getClass()) && tree.getClass().equals(IdContext.class)) {
                expectedType = ExpressionContext.class;

                id = (String)this.visit(tree);

                continue;
            }

            if (expectedType.equals(tree.getClass()) && tree.getClass().equals(ExpressionContext.class)) {
                expectedType = ExpressionContext.class;

                value = this.visit(tree);

                continue;
            }

            RuntimeException e = new RuntimeException("Received an unexpected tree: " + tree.getClass().toString());
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        if (value == null) {
            RuntimeException e = new RuntimeException("Did not receive a value from assignment.");
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        if (id == null || id.length() == 0) {
            RuntimeException e = new RuntimeException("Id was empty or null");
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        // TODO: Check for all hardcoded classes!
        Class<?> valueType = value.getClass();
        Class<?> type = null;
        if (
                !valueType.equals(LinearLayer.class)
        ) {
            RuntimeException e = new RuntimeException("Did not recognize type of value assigned.");
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        table.insertValueAndType(id, type, value);
        System.out.println("Inserted value into the table: " + id + " = " + value.toString());

        return null;
    }

    @Override
    public Object visitLinearLayer(LinearLayerContext ctx) {
        List<Integer> sizes = new ArrayList<>();

        for (ParseTree tree : ctx.children) {
            if (tree.getClass().equals(TerminalNodeImpl.class))
                continue;

            if (tree.getClass().equals(IntContext.class)) {
                Integer integer = (Integer)this.visit(tree);

                if (integer < 1) {
                    RuntimeException e = new RuntimeException("Expected a positive size, got: " + integer.toString());
                    try {
                        Logger.LogException(e);
                    } catch (Exception ex) {}
                    throw e;
                }

                sizes.add(integer);

                continue;
            }

            
            RuntimeException e = new RuntimeException("Expected Integer received: " + tree.getClass().toString());
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        if (sizes.size() != 2) {
            RuntimeException e = new RuntimeException("Expected two sizes, received: " + sizes.toString());
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        LinearLayer layer = new LinearLayer(sizes.get(0), sizes.get(1));

        return layer;
    }

    @Override
    public Object visitId(IdContext ctx) {
        String id = ctx.getText();

        if (id.length() == 0) {
            RuntimeException e = new RuntimeException("Somehow ID was nothing!");
            try {
                Logger.LogException(e);
            } catch (Exception ex) {}
            throw e;
        }

        return id;
    }

    @Override
    public Object visitInt(IntContext ctx) {
        String txt = ctx.getText();
        Integer integer;

        try {
            integer = Integer.parseInt(txt);
        }
        catch (NumberFormatException ex1) {
            RuntimeException e = new RuntimeException("Couldn't parse int: " + txt);
            try {
                Logger.LogException(e);
            } catch (Exception ex2) {}
            throw e;
        }

        return integer;
    }

    @Override
    public Object visitActivation(ActivationContext ctx) {
        Object function = visitChildren(ctx);

        Class<?> type = function.getClass();
        if (
                type != ReLU.class &&
                type != Tanh.class &&
                type != Sigmoid.class
        ) {
            RuntimeException e = new RuntimeException("Did not receive an activation function: " + type.toString());
            try {
                Logger.LogException(e);
            } catch (Exception ex2) {}
            throw e;
        }

        return function;
    }

    @Override
    public Object visitRelu(ReluContext ctx) {
        return new ReLU();
    }

    @Override
    public Object visitSigmoid(SigmoidContext ctx) {
        return new Sigmoid();
    }

    @Override
    public Object visitTanh(TanhContext ctx) {
        return new Tanh();
    }

    public static class ValueTableEntry {
        private Class<?> type;
        private Object value;

        public ValueTableEntry(Class<?> type, Object value) {
            this.type = type;
            this.value = value;
        }
    }

    public static class ValueTable extends HashMap<String, ValueTableEntry> {
        public boolean hasId(String id) {
            return this.containsKey(id);
        }

        public Class<?> getType(String id) {
            return this.get(id).type;
        }

        public Object getValue(String id) {
            return this.get(id).value;
        }

        /**
         * @param id The id of the object to check.
         * @param type The type to check for equivalence.
         * @return Returns 1 if the id has the type 'type', 0 if the object was found but did not have correct type, and -1 if the object wasn't found.
         */
        public Integer idHasType(String id, Class<?> type) {
            if (!this.hasId(id)) return -1;
            if (this.getType(id).equals(type)) return 1;
            return 0;
        }

        /**
         * @param id The object id to insert.
         * @param type The type of the object.
         * @param value The value of the object.
         * @return If the table already contains an entry for this id, it is overwritten and returned. Otherwise null is returned.
         */
        public ValueTableEntry insertValueAndType(String id, Class<?> type, Object value) {
            ValueTableEntry entry = new ValueTableEntry(type, value);
            return this.put(id, entry);
        }
    }

    public static class LinearLayer {
        private Integer inputSize;
        private Integer size;

		public LinearLayer(Integer inputSize, Integer size) {
            this.inputSize = inputSize;
            this.size = size;
        }

        public Integer getSize() {
			return size;
		}

        public Integer getInputSize() {
			return inputSize;
		}

        @Override
        public String toString() {
            return "linear (" + inputSize + ", " + size + ")";
        }
    }

    public static class ReLU {
        @Override
        public String toString() {
            return "ReLU";
        }
    }

    public static class Tanh {
        @Override
        public String toString() {
            return "Tanh";
        }
    }

    public static class Sigmoid {
        @Override
        public String toString() {
            return "Sigmoid";
        }
    }
}
