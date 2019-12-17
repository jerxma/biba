package expression;
public class Subtract extends AbstractBinOperation {
    public Subtract(AbstractOperand first, AbstractOperand second) {
        super(first, second);
    }

    @Override
    protected String getSign() {
        return "-";
    }

    @Override
    protected int calculate(int first, int second) {
        return first - second;
    }

    @Override
    protected double calculate(double first, double second) {
        return first - second;
    }

    @Override
    protected boolean isCommutative() {
        return false;
    }

    @Override
    protected int getPriority() {
        return 0;
    }
}