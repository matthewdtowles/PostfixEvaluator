package postfixevaluator.operator;

/**
 * AddOperator
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class AddOperator extends Operator {

    /**
     * Constructor
     */
    public AddOperator() {
        this.name = ADD_NAME;
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
    
}
