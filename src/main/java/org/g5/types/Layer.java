package org.g5.types;

public abstract class Layer {
    protected Float inputSize;
    protected Float outputSize;

    public Float getInputSize() {
        return this.inputSize;
    }

    public Float getOutputSize() {
        return this.outputSize;
    }

    @Override
    public String toString() {
        return String.format("Layer - input size: %s, output size: %s", this.inputSize, this.outputSize);
    }
}
