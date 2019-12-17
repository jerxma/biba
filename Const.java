package expression;
public class Const extends AbstractOperand {
    protected Number val;

    public Const(Number val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        return  super.equals(obj)
                && ((Const) obj).val.equals(this.val);
    }

    @Override
    public int evaluate(int val) {
        return this.val.intValue();
    }

    @Override
    public double evaluate(double val) {
        return this.val.doubleValue();
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return val.intValue();
    }
    
    @Override
    public String toString() {
        return val.toString();
    }

    @Override
    public int hashCode() {
        return val.hashCode();
    }
}