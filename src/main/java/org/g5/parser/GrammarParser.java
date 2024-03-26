// Generated from Grammar.g4 by ANTLR 4.13.1
package org.g5.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, INT=41, ID=42, STRING=43, WS=44, COMMENT=45, MULTILINECOMMENT=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_else = 2, RULE_expression = 3, 
		RULE_model = 4, RULE_sequentialContainer = 5, RULE_activation = 6, RULE_layer = 7, 
		RULE_linearLayer = 8, RULE_arith = 9, RULE_chainedArith = 10, RULE_id = 11, 
		RULE_int = 12, RULE_float = 13, RULE_string = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "else", "expression", "model", "sequentialContainer", 
			"activation", "layer", "linearLayer", "arith", "chainedArith", "id", 
			"int", "float", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'loop'", "'{'", "'}'", "'break'", "'if'", "'print'", 
			"'('", "')'", "'SGD'", "','", "'export'", "'as'", "'else'", "'and'", 
			"'or'", "'>'", "'>='", "'<'", "'<='", "'=='", "'import'", "'MNISTDigits'", 
			"'MNISTDigitsTest'", "'MNISTDigitsLabels'", "'MNISTDigitsTestLabels'", 
			"'calculate_accuracy'", "'MSE'", "'sequential'", "'->'", "'ReLU'", "'Tanh'", 
			"'Sigmoid'", "'linear'", "'*'", "'/'", "'+'", "'-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "ID", "STRING", "WS", "COMMENT", 
			"MULTILINECOMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046521800L) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementIfContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBreakContext extends StatementContext {
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementLoopContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementPrintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSGDContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementSGDContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementSGD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementSGD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementSGD(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExportContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StatementExportContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementExport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssignmentContext extends StatementContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				id();
				setState(39);
				match(T__0);
				setState(40);
				expression(0);
				setState(41);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new StatementLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__2);
				setState(44);
				match(T__3);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046521800L) != 0)) {
					{
					{
					setState(45);
					statement();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__5);
				setState(53);
				match(T__1);
				}
				break;
			case T__6:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(T__6);
				setState(55);
				expression(0);
				setState(56);
				match(T__3);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046521800L) != 0)) {
					{
					{
					setState(57);
					statement();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(T__4);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(64);
					else_();
					}
				}

				}
				break;
			case T__7:
				_localctx = new StatementPrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(T__7);
				setState(68);
				match(T__8);
				setState(69);
				expression(0);
				setState(70);
				match(T__9);
				setState(71);
				match(T__1);
				}
				break;
			case T__10:
				_localctx = new StatementSGDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(T__10);
				setState(74);
				match(T__8);
				setState(75);
				expression(0);
				setState(76);
				match(T__11);
				setState(77);
				expression(0);
				setState(78);
				match(T__11);
				setState(79);
				expression(0);
				setState(80);
				match(T__9);
				setState(81);
				match(T__1);
				}
				break;
			case T__12:
				_localctx = new StatementExportContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				match(T__12);
				setState(84);
				expression(0);
				setState(85);
				match(T__13);
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(86);
					id();
					}
					break;
				case STRING:
					{
					setState(87);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__14);
			setState(95);
			match(T__3);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046521800L) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionModelContext extends ExpressionContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public ExpressionModelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionModel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLayerContext extends ExpressionContext {
		public LayerContext layer() {
			return getRuleContext(LayerContext.class,0);
		}
		public ExpressionLayerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionLayer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionModelCallContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionModelCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionModelCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionModelCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionModelCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIntegerContext extends ExpressionContext {
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public ExpressionIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLeqContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionLeqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionLeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionLeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionLeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionEqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBooleanOrContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionBooleanOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionBooleanOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionBooleanOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionBooleanOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParenthesisContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAccuracyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionAccuracyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionAccuracy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionAccuracy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionAccuracy(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMSEContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMSEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionMSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionMSE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionMSE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGeqContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionGeqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionGeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionGeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionGeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionFloatContext extends ExpressionContext {
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public ExpressionFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionImportDigitsContext extends ExpressionContext {
		public ExpressionImportDigitsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionImportDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionImportDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionImportDigits(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionArithContext extends ExpressionContext {
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public ExpressionArithContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionArith(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBooleanAndContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionBooleanAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionBooleanAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionBooleanAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionBooleanAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionGeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionGe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLeContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionLeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionLe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStringContext extends ExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionImportDigitsTestContext extends ExpressionContext {
		public ExpressionImportDigitsTestContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionImportDigitsTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionImportDigitsTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionImportDigitsTest(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionIdContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpressionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpressionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpressionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				id();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionLayerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				layer();
				}
				break;
			case 3:
				{
				_localctx = new ExpressionModelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				model();
				}
				break;
			case 4:
				{
				_localctx = new ExpressionStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				string();
				}
				break;
			case 5:
				{
				_localctx = new ExpressionIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				int_();
				}
				break;
			case 6:
				{
				_localctx = new ExpressionFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				float_();
				}
				break;
			case 7:
				{
				_localctx = new ExpressionArithContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				arith();
				}
				break;
			case 8:
				{
				_localctx = new ExpressionParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(T__8);
				setState(113);
				expression(0);
				setState(114);
				match(T__9);
				}
				break;
			case 9:
				{
				_localctx = new ExpressionImportDigitsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(T__22);
				setState(117);
				match(T__23);
				}
				break;
			case 10:
				{
				_localctx = new ExpressionImportDigitsTestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(T__22);
				setState(119);
				match(T__24);
				}
				break;
			case 11:
				{
				_localctx = new ExpressionImportDigitsTestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(T__22);
				setState(121);
				match(T__25);
				}
				break;
			case 12:
				{
				_localctx = new ExpressionImportDigitsTestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__22);
				setState(123);
				match(T__26);
				}
				break;
			case 13:
				{
				_localctx = new ExpressionAccuracyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__27);
				setState(125);
				match(T__8);
				setState(126);
				expression(0);
				setState(127);
				match(T__11);
				setState(128);
				expression(0);
				setState(129);
				match(T__9);
				}
				break;
			case 14:
				{
				_localctx = new ExpressionMSEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__28);
				setState(132);
				match(T__8);
				setState(133);
				expression(0);
				setState(134);
				match(T__11);
				setState(135);
				expression(0);
				setState(136);
				match(T__9);
				}
				break;
			case 15:
				{
				_localctx = new ExpressionModelCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				id();
				setState(139);
				match(T__8);
				setState(140);
				expression(0);
				setState(141);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionBooleanAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(146);
						match(T__15);
						setState(147);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionBooleanOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(149);
						match(T__16);
						setState(150);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionLeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(152);
						match(T__17);
						setState(153);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionLeqContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(155);
						match(T__18);
						setState(156);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionGeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(158);
						match(T__19);
						setState(159);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionGeqContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						match(T__20);
						setState(162);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionEqContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						match(T__21);
						setState(165);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelContext extends ParserRuleContext {
		public SequentialContainerContext sequentialContainer() {
			return getRuleContext(SequentialContainerContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			sequentialContainer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequentialContainerContext extends ParserRuleContext {
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ActivationContext> activation() {
			return getRuleContexts(ActivationContext.class);
		}
		public ActivationContext activation(int i) {
			return getRuleContext(ActivationContext.class,i);
		}
		public SequentialContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequentialContainer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSequentialContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSequentialContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSequentialContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentialContainerContext sequentialContainer() throws RecognitionException {
		SequentialContainerContext _localctx = new SequentialContainerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sequentialContainer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__29);
			setState(174);
			match(T__8);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(175);
				layer();
				}
				break;
			case ID:
				{
				setState(176);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(179);
				match(T__30);
				setState(180);
				activation();
				setState(181);
				match(T__30);
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
					{
					setState(182);
					layer();
					}
					break;
				case ID:
					{
					setState(183);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActivationContext extends ParserRuleContext {
		public ActivationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activation; }
	 
		public ActivationContext() { }
		public void copyFrom(ActivationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActivationReLUContext extends ActivationContext {
		public ActivationReLUContext(ActivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterActivationReLU(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitActivationReLU(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitActivationReLU(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActivationSigmoidContext extends ActivationContext {
		public ActivationSigmoidContext(ActivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterActivationSigmoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitActivationSigmoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitActivationSigmoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActivationTanhContext extends ActivationContext {
		public ActivationTanhContext(ActivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterActivationTanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitActivationTanh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitActivationTanh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActivationContext activation() throws RecognitionException {
		ActivationContext _localctx = new ActivationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_activation);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new ActivationReLUContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new ActivationTanhContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new ActivationSigmoidContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayerContext extends ParserRuleContext {
		public LinearLayerContext linearLayer() {
			return getRuleContext(LinearLayerContext.class,0);
		}
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_layer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			linearLayer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LinearLayerContext extends ParserRuleContext {
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public List<IntContext> int_() {
			return getRuleContexts(IntContext.class);
		}
		public IntContext int_(int i) {
			return getRuleContext(IntContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public LinearLayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linearLayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLinearLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLinearLayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLinearLayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinearLayerContext linearLayer() throws RecognitionException {
		LinearLayerContext _localctx = new LinearLayerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_linearLayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__34);
			setState(201);
			match(T__8);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(202);
				arith();
				}
				break;
			case 2:
				{
				setState(203);
				int_();
				}
				break;
			case 3:
				{
				setState(204);
				id();
				}
				break;
			}
			setState(207);
			match(T__11);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(208);
				arith();
				}
				break;
			case 2:
				{
				setState(209);
				int_();
				}
				break;
			case 3:
				{
				setState(210);
				id();
				}
				break;
			}
			setState(213);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithContext extends ParserRuleContext {
		public ArithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith; }
	 
		public ArithContext() { }
		public void copyFrom(ArithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithDivisionContext extends ArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ArithDivisionContext(ArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArithDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArithDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArithDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithMultiplicationContext extends ArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ArithMultiplicationContext(ArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArithMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArithMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArithMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithAdditionContext extends ArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ArithAdditionContext(ArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArithAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArithAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArithAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithSubtractionContext extends ArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ArithSubtractionContext(ArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArithSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArithSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArithSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithContext arith() throws RecognitionException {
		ArithContext _localctx = new ArithContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arith);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArithMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				chainedArith(0);
				setState(216);
				((ArithMultiplicationContext)_localctx).op = match(T__35);
				setState(217);
				chainedArith(0);
				}
				break;
			case 2:
				_localctx = new ArithDivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				chainedArith(0);
				setState(220);
				((ArithDivisionContext)_localctx).op = match(T__36);
				setState(221);
				chainedArith(0);
				}
				break;
			case 3:
				_localctx = new ArithAdditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				chainedArith(0);
				setState(224);
				((ArithAdditionContext)_localctx).op = match(T__37);
				setState(225);
				chainedArith(0);
				}
				break;
			case 4:
				_localctx = new ArithSubtractionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				chainedArith(0);
				setState(228);
				((ArithSubtractionContext)_localctx).op = match(T__38);
				setState(229);
				chainedArith(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithContext extends ParserRuleContext {
		public ChainedArithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainedArith; }
	 
		public ChainedArithContext() { }
		public void copyFrom(ChainedArithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithSubtractionContext extends ChainedArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ChainedArithSubtractionContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithIdContext extends ChainedArithContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ChainedArithIdContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithIntContext extends ChainedArithContext {
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public ChainedArithIntContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithMultiplicationContext extends ChainedArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ChainedArithMultiplicationContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithDivisionContext extends ChainedArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ChainedArithDivisionContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithFloatContext extends ChainedArithContext {
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public ChainedArithFloatContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedArithAdditionContext extends ChainedArithContext {
		public Token op;
		public List<ChainedArithContext> chainedArith() {
			return getRuleContexts(ChainedArithContext.class);
		}
		public ChainedArithContext chainedArith(int i) {
			return getRuleContext(ChainedArithContext.class,i);
		}
		public ChainedArithAdditionContext(ChainedArithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChainedArithAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChainedArithAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChainedArithAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainedArithContext chainedArith() throws RecognitionException {
		return chainedArith(0);
	}

	private ChainedArithContext chainedArith(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ChainedArithContext _localctx = new ChainedArithContext(_ctx, _parentState);
		ChainedArithContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_chainedArith, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ChainedArithIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(234);
				id();
				}
				break;
			case 2:
				{
				_localctx = new ChainedArithIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				int_();
				}
				break;
			case 3:
				{
				_localctx = new ChainedArithFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				float_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ChainedArithMultiplicationContext(new ChainedArithContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_chainedArith);
						setState(239);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(240);
						((ChainedArithMultiplicationContext)_localctx).op = match(T__35);
						setState(241);
						chainedArith(8);
						}
						break;
					case 2:
						{
						_localctx = new ChainedArithDivisionContext(new ChainedArithContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_chainedArith);
						setState(242);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(243);
						((ChainedArithDivisionContext)_localctx).op = match(T__36);
						setState(244);
						chainedArith(7);
						}
						break;
					case 3:
						{
						_localctx = new ChainedArithAdditionContext(new ChainedArithContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_chainedArith);
						setState(245);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(246);
						((ChainedArithAdditionContext)_localctx).op = match(T__37);
						setState(247);
						chainedArith(6);
						}
						break;
					case 4:
						{
						_localctx = new ChainedArithSubtractionContext(new ChainedArithContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_chainedArith);
						setState(248);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(249);
						((ChainedArithSubtractionContext)_localctx).op = match(T__38);
						setState(250);
						chainedArith(5);
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrammarParser.INT, i);
		}
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(INT);
			setState(261);
			match(T__39);
			setState(262);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return chainedArith_sempred((ChainedArithContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean chainedArith_sempred(ChainedArithContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u010b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"Y\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002b\b\u0002\n\u0002\f\u0002e\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0090"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a7\b\u0003\n"+
		"\u0003\f\u0003\u00aa\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b2\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b9\b\u0005\u0005"+
		"\u0005\u00bb\b\u0005\n\u0005\f\u0005\u00be\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c5\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ce\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d4\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e8\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ee\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00fc\b\n\n\n\f\n\u00ff\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0002\u0006\u0014\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u012e\u0000!\u0001\u0000\u0000"+
		"\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000"+
		"\u0006\u008f\u0001\u0000\u0000\u0000\b\u00ab\u0001\u0000\u0000\u0000\n"+
		"\u00ad\u0001\u0000\u0000\u0000\f\u00c4\u0001\u0000\u0000\u0000\u000e\u00c6"+
		"\u0001\u0000\u0000\u0000\u0010\u00c8\u0001\u0000\u0000\u0000\u0012\u00e7"+
		"\u0001\u0000\u0000\u0000\u0014\u00ed\u0001\u0000\u0000\u0000\u0016\u0100"+
		"\u0001\u0000\u0000\u0000\u0018\u0102\u0001\u0000\u0000\u0000\u001a\u0104"+
		"\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e \u0003"+
		"\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001"+
		"%\u0001\u0001\u0000\u0000\u0000&\'\u0003\u0016\u000b\u0000\'(\u0005\u0001"+
		"\u0000\u0000()\u0003\u0006\u0003\u0000)*\u0005\u0002\u0000\u0000*]\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0003\u0000\u0000,0\u0005\u0004\u0000\u0000"+
		"-/\u0003\u0002\u0001\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u00003]\u0005\u0005\u0000\u000045\u0005"+
		"\u0006\u0000\u00005]\u0005\u0002\u0000\u000067\u0005\u0007\u0000\u0000"+
		"78\u0003\u0006\u0003\u00008<\u0005\u0004\u0000\u00009;\u0003\u0002\u0001"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?A\u0005\u0005\u0000\u0000@B\u0003\u0004\u0002\u0000"+
		"A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B]\u0001\u0000\u0000"+
		"\u0000CD\u0005\b\u0000\u0000DE\u0005\t\u0000\u0000EF\u0003\u0006\u0003"+
		"\u0000FG\u0005\n\u0000\u0000GH\u0005\u0002\u0000\u0000H]\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u000b\u0000\u0000JK\u0005\t\u0000\u0000KL\u0003\u0006\u0003"+
		"\u0000LM\u0005\f\u0000\u0000MN\u0003\u0006\u0003\u0000NO\u0005\f\u0000"+
		"\u0000OP\u0003\u0006\u0003\u0000PQ\u0005\n\u0000\u0000QR\u0005\u0002\u0000"+
		"\u0000R]\u0001\u0000\u0000\u0000ST\u0005\r\u0000\u0000TU\u0003\u0006\u0003"+
		"\u0000UX\u0005\u000e\u0000\u0000VY\u0003\u0016\u000b\u0000WY\u0003\u001c"+
		"\u000e\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0002\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\&\u0001\u0000\u0000\u0000\\+\u0001\u0000\u0000\u0000\\4\u0001\u0000"+
		"\u0000\u0000\\6\u0001\u0000\u0000\u0000\\C\u0001\u0000\u0000\u0000\\I"+
		"\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000]\u0003\u0001\u0000"+
		"\u0000\u0000^_\u0005\u000f\u0000\u0000_c\u0005\u0004\u0000\u0000`b\u0003"+
		"\u0002\u0001\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0005\u0000\u0000g\u0005\u0001"+
		"\u0000\u0000\u0000hi\u0006\u0003\uffff\uffff\u0000i\u0090\u0003\u0016"+
		"\u000b\u0000j\u0090\u0003\u000e\u0007\u0000k\u0090\u0003\b\u0004\u0000"+
		"l\u0090\u0003\u001c\u000e\u0000m\u0090\u0003\u0018\f\u0000n\u0090\u0003"+
		"\u001a\r\u0000o\u0090\u0003\u0012\t\u0000pq\u0005\t\u0000\u0000qr\u0003"+
		"\u0006\u0003\u0000rs\u0005\n\u0000\u0000s\u0090\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0017\u0000\u0000u\u0090\u0005\u0018\u0000\u0000vw\u0005\u0017"+
		"\u0000\u0000w\u0090\u0005\u0019\u0000\u0000xy\u0005\u0017\u0000\u0000"+
		"y\u0090\u0005\u001a\u0000\u0000z{\u0005\u0017\u0000\u0000{\u0090\u0005"+
		"\u001b\u0000\u0000|}\u0005\u001c\u0000\u0000}~\u0005\t\u0000\u0000~\u007f"+
		"\u0003\u0006\u0003\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003"+
		"\u0006\u0003\u0000\u0081\u0082\u0005\n\u0000\u0000\u0082\u0090\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\u001d\u0000\u0000\u0084\u0085\u0005\t\u0000"+
		"\u0000\u0085\u0086\u0003\u0006\u0003\u0000\u0086\u0087\u0005\f\u0000\u0000"+
		"\u0087\u0088\u0003\u0006\u0003\u0000\u0088\u0089\u0005\n\u0000\u0000\u0089"+
		"\u0090\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0016\u000b\u0000\u008b"+
		"\u008c\u0005\t\u0000\u0000\u008c\u008d\u0003\u0006\u0003\u0000\u008d\u008e"+
		"\u0005\n\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008fh\u0001"+
		"\u0000\u0000\u0000\u008fj\u0001\u0000\u0000\u0000\u008fk\u0001\u0000\u0000"+
		"\u0000\u008fl\u0001\u0000\u0000\u0000\u008fm\u0001\u0000\u0000\u0000\u008f"+
		"n\u0001\u0000\u0000\u0000\u008fo\u0001\u0000\u0000\u0000\u008fp\u0001"+
		"\u0000\u0000\u0000\u008ft\u0001\u0000\u0000\u0000\u008fv\u0001\u0000\u0000"+
		"\u0000\u008fx\u0001\u0000\u0000\u0000\u008fz\u0001\u0000\u0000\u0000\u008f"+
		"|\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000\u0000\u0000\u008f\u008a"+
		"\u0001\u0000\u0000\u0000\u0090\u00a8\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\n\u000e\u0000\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u00a7\u0003"+
		"\u0006\u0003\u000f\u0094\u0095\n\r\u0000\u0000\u0095\u0096\u0005\u0011"+
		"\u0000\u0000\u0096\u00a7\u0003\u0006\u0003\u000e\u0097\u0098\n\f\u0000"+
		"\u0000\u0098\u0099\u0005\u0012\u0000\u0000\u0099\u00a7\u0003\u0006\u0003"+
		"\r\u009a\u009b\n\u000b\u0000\u0000\u009b\u009c\u0005\u0013\u0000\u0000"+
		"\u009c\u00a7\u0003\u0006\u0003\f\u009d\u009e\n\n\u0000\u0000\u009e\u009f"+
		"\u0005\u0014\u0000\u0000\u009f\u00a7\u0003\u0006\u0003\u000b\u00a0\u00a1"+
		"\n\t\u0000\u0000\u00a1\u00a2\u0005\u0015\u0000\u0000\u00a2\u00a7\u0003"+
		"\u0006\u0003\n\u00a3\u00a4\n\b\u0000\u0000\u00a4\u00a5\u0005\u0016\u0000"+
		"\u0000\u00a5\u00a7\u0003\u0006\u0003\t\u00a6\u0091\u0001\u0000\u0000\u0000"+
		"\u00a6\u0094\u0001\u0000\u0000\u0000\u00a6\u0097\u0001\u0000\u0000\u0000"+
		"\u00a6\u009a\u0001\u0000\u0000\u0000\u00a6\u009d\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0007\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\n\u0005\u0000\u00ac"+
		"\t\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001e\u0000\u0000\u00ae\u00b1"+
		"\u0005\t\u0000\u0000\u00af\u00b2\u0003\u000e\u0007\u0000\u00b0\u00b2\u0003"+
		"\u0016\u000b\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00bc\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u001f\u0000\u0000\u00b4\u00b5\u0003\f\u0006\u0000\u00b5\u00b8\u0005\u001f"+
		"\u0000\u0000\u00b6\u00b9\u0003\u000e\u0007\u0000\u00b7\u00b9\u0003\u0016"+
		"\u000b\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\n\u0000"+
		"\u0000\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005 \u0000\u0000"+
		"\u00c2\u00c5\u0005!\u0000\u0000\u00c3\u00c5\u0005\"\u0000\u0000\u00c4"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\r\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0003\u0010\b\u0000\u00c7\u000f\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"#\u0000\u0000\u00c9\u00cd\u0005\t\u0000\u0000\u00ca\u00ce\u0003\u0012"+
		"\t\u0000\u00cb\u00ce\u0003\u0018\f\u0000\u00cc\u00ce\u0003\u0016\u000b"+
		"\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d3\u0005\f\u0000\u0000\u00d0\u00d4\u0003\u0012\t\u0000"+
		"\u00d1\u00d4\u0003\u0018\f\u0000\u00d2\u00d4\u0003\u0016\u000b\u0000\u00d3"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005\n\u0000\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0003\u0014\n\u0000\u00d8\u00d9\u0005$\u0000\u0000\u00d9\u00da\u0003"+
		"\u0014\n\u0000\u00da\u00e8\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u0014"+
		"\n\u0000\u00dc\u00dd\u0005%\u0000\u0000\u00dd\u00de\u0003\u0014\n\u0000"+
		"\u00de\u00e8\u0001\u0000\u0000\u0000\u00df\u00e0\u0003\u0014\n\u0000\u00e0"+
		"\u00e1\u0005&\u0000\u0000\u00e1\u00e2\u0003\u0014\n\u0000\u00e2\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003\u0014\n\u0000\u00e4\u00e5\u0005"+
		"\'\u0000\u0000\u00e5\u00e6\u0003\u0014\n\u0000\u00e6\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e7\u00d7\u0001\u0000\u0000\u0000\u00e7\u00db\u0001\u0000"+
		"\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e8\u0013\u0001\u0000\u0000\u0000\u00e9\u00ea\u0006\n\uffff"+
		"\uffff\u0000\u00ea\u00ee\u0003\u0016\u000b\u0000\u00eb\u00ee\u0003\u0018"+
		"\f\u0000\u00ec\u00ee\u0003\u001a\r\u0000\u00ed\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00fd\u0001\u0000\u0000\u0000\u00ef\u00f0\n\u0007\u0000\u0000"+
		"\u00f0\u00f1\u0005$\u0000\u0000\u00f1\u00fc\u0003\u0014\n\b\u00f2\u00f3"+
		"\n\u0006\u0000\u0000\u00f3\u00f4\u0005%\u0000\u0000\u00f4\u00fc\u0003"+
		"\u0014\n\u0007\u00f5\u00f6\n\u0005\u0000\u0000\u00f6\u00f7\u0005&\u0000"+
		"\u0000\u00f7\u00fc\u0003\u0014\n\u0006\u00f8\u00f9\n\u0004\u0000\u0000"+
		"\u00f9\u00fa\u0005\'\u0000\u0000\u00fa\u00fc\u0003\u0014\n\u0005\u00fb"+
		"\u00ef\u0001\u0000\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fc"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u0015\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0005*\u0000\u0000\u0101\u0017"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005)\u0000\u0000\u0103\u0019\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005)\u0000\u0000\u0105\u0106\u0005(\u0000"+
		"\u0000\u0106\u0107\u0005)\u0000\u0000\u0107\u001b\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005+\u0000\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u0014"+
		"!0<AX\\c\u008f\u00a6\u00a8\u00b1\u00b8\u00bc\u00c4\u00cd\u00d3\u00e7\u00ed"+
		"\u00fb\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}