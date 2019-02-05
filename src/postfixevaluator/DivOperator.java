/*
 * Matthew Towles
 * Feb 4, 2019
 * Division Operator 
 */

package postfixevaluator;

/**
 * Division Operator 
 * @author matthew.towles
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
    public double evaluate(double a, double b) {
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
