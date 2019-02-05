/*
 * Matthew Towles
 * Feb 4, 2019
 * SubOperator 
 */

package postfixevaluator;

/**
 * SubOperator
 * @author matthew.towles
 */
public class SubOperator extends Operator {

    private int precedence;
    private String symbol;

    
    /**
     * Constructor
     */
    public SubOperator() {
        this.precedence = SUB_PRECEDENCE;
        this.symbol = SUB_SYMBOL;
    }
    
    
    /**
     * Returns a - b:  in that order
     * @param a
     * @param b
     * @return - difference of (a - b) 
     */
    @Override
    public double evaluate(double a, double b) {
        return a - b;
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
