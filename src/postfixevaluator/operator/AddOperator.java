package postfixevaluator.operator;

/**
 * AddOperator
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class AddOperator extends Operator {

    private int precedence;
    private String symbol;

    
    /**
     * Constructor
     */
    public AddOperator() {
        this.precedence = ADD_PRECEDENCE;
        this.symbol = ADD_SYMBOL;
    }
    
    
    /**
     * @param a
     * @param b
     * @return - sum of a + b
     */
    @Override
    public int evaluate(int a, int b) {
        return a + b;
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
