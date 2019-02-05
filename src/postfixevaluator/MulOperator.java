/*
 * Matthew Towles
 * Feb 4, 2019
 * Multiplication Operator 
 */

package postfixevaluator;

/**
 * Multiplication Operator
 * @author matthew.towles
 */
public class MulOperator extends Operator {

    private int precedence;
    private String symbol;

    
    /**
     * Constructor
     */
    public MulOperator() {
        this.precedence = MUL_PRECEDENCE;
        this.symbol = MUL_SYMBOL;
    }
    
    
    /**
     * @param a
     * @param b
     * @return - product of a*b 
     */
    @Override
    public double evaluate(double a, double b) {
        return a * b;
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
