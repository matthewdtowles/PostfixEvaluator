package postfixevaluator.operator;

/**
 * Division Operator
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class DivOperator extends Operator {

    /**
     * Constructor
     */
    public DivOperator() {
        this.name = DIV_NAME;
        this.symbol = DIV_SYMBOL;
    }
    
    
    /**
     * Returns a divided by b (in that order)
     * @param a
     * @param b
     * @return - quotient of (a/b) 
     */
    @Override
    public int evaluate(int a, int b) {
        return a / b;
    }

}