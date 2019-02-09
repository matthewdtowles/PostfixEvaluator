package postfixevaluator.operator;

/**
 * Abstract Operator class for arithmetic operators
 * Extended by AddOp, SubOp, MulOp, DivOp
 * @author matthew.towles
 * @date Feb 4, 2019
 */
abstract public class Operator {
    
    /**
     * Precedence Values for each Operator type
     * Not necessary for Postfix Evaluations
     * But necessary if eval infix
     */
    protected static final String ADD_NAME = "Add";
    protected static final String SUB_NAME = "Sub";
    protected static final String MUL_NAME = "Mul";
    protected static final String DIV_NAME = "Div";
    
    
    /**
     * Operator symbols
     */
    public static final String ADD_SYMBOL = "+";
    public static final String SUB_SYMBOL = "-";
    public static final String MUL_SYMBOL = "*";
    public static final String DIV_SYMBOL = "/";
    
    
    /**
     * Math operator's name in string form
     * e.g.: AddOperator.name = "Add"
     */
    protected String name;
    
    /**
     * Math symbol of operator
     * e.g.: MulOperator.symbol = "*"
     */
    protected String symbol;
   

    /**
     * Evaluates two numbers based on type of operation
     * @param a - first number
     * @param b - second number
     * @return int - a (operation) b
     */
    abstract public int evaluate(int a, int b);
    
    
    /**
     * Getter operator's name
     * @return int - precedence value for Operator
     */
    public String getName() {
        return name;
    }
    
    
    /**
     * Getter for symbol
     * @return String - symbol of operation
     */
    public String getSymbol() {
        return symbol;
    }
}
