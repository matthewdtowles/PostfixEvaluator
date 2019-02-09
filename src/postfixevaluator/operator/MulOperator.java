package postfixevaluator.operator;

/**
 * Multiplication Operator
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class MulOperator extends Operator {

    /**
     * Constructor
     */
    public MulOperator() {
        this.name = MUL_NAME;
        this.symbol = MUL_SYMBOL;
    }
    
    
    /**
     * @param a
     * @param b
     * @return - product of a*b 
     */
    @Override
    public int evaluate(int a, int b) {
        return a * b;
    }

}
