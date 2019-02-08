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
    public static final int ADD_PRECEDENCE = 1;
    public static final int SUB_PRECEDENCE = 1;
    public static final int MUL_PRECEDENCE = 2;
    public static final int DIV_PRECEDENCE = 2;
    
    
    /**
     * Operator symbols
     */
    public static final String ADD_SYMBOL = "+";
    public static final String SUB_SYMBOL = "-";
    public static final String MUL_SYMBOL = "*";
    public static final String DIV_SYMBOL = "/";
    
    
    /**
     * Operators precedence value
     * Higher value = higher precedence
     * Lowest precedence value = 1
     */
    private int precedence;
    
    /**
     * Math symbol of operator
     */
    private String symbol;
   

    /**
     * Evaluates two numbers based on type of operation
     * @param a - first number
     * @param b - second number
     * @return int - a (operation) b
     */
    abstract public int evaluate(int a, int b);
    
    
    /**
     * Getter for precedence 
     * Must be implemented by each subclass
     * @return int - precedence value for Operator
     */
    abstract public int getPrecedence();
    
    
    /**
     * Getter for symbol
     * Must be implemented by each subclass
     * @return String - symbol of operation
     */
    abstract public String getSymbol();
}
