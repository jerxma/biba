package expression;
public class Add extends AbstractBinOperation {
    public Add(AbstractOperand first, AbstractOperand second) {
        super(first, second);
    }

    @Override
    protected String getSign() {
        return "+";
    }


    
    @Override
    protected int calculate(int first, int second) {
        return first + second;
    }

    @Override
    protected double calculate(double first, double second) {
        return first + second;
    }

    @Override
    protected boolean isCommutative() {
        return true;
    }

    @Override
    protected int getPriority() {
        return 0;
    }
}