package postfixevaluator.operator;

/**
 * SubOperator
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class SubOperator extends Operator {

    /**
     * Constructor
     */
    public SubOperator() {
        this.name = SUB_NAME;
        this.symbol = SUB_SYMBOL;
    }
    
    
    /**
     * Returns a - b:  in that order
     * @param a
     * @param b
     * @return - difference of (a - b) 
     */
    @Override
    public int evaluate(int a, int b) {
        return a - b;
    }

}