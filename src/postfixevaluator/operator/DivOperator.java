package postfixevaluator.operator;

/**
 * Division Operator
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class DivOperator extends Operator {

    private int precedence;
    private String symbol;

    
    /**
     * Constructor
     */
    public DivOperator() {
        this.precedence = DIV_PRECEDENCE;
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

    
    /**
     * @return precedence value
     */
    @Override
    public int getPrecedence() {
        return precedence;
    }
    
    
    /**
     * @return symbol representation of operator
     */
    @Override
    public String getSymbol() {
        return symbol;
    }
}
