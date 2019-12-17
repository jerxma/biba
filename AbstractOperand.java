package expression;

public abstract class AbstractOperand implements Expression, DoubleExpression, TripleExpression {
    
    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null) {
    //         return false;
    //     }
    //     if (obj == this) {
    //         return true;
    //     }
    //     return (obj.getClass() == this.getClass()); 
    // }

    @Override
    public boolean equals(Object obj) {
        return obj == null ? false : (obj.getClass() == this.getClass()); 
    }

    @Override
    public abstract int evaluate(int val);

    @Override
    public abstract double evaluate(double val);

    @Override
    public abstract int evaluate(int x, int y, int z);

}