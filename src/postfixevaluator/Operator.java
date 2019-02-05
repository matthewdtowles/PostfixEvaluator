/*
 * Matthew Towles
 * Feb 4, 2019
 * Abstract class for arithmetic operators
 */

package postfixevaluator;

/**
 * Abstract Operator class
 * Extended by AddOp, SubOp, MulOp, DivOp
 * @author matthew.towles
 */
abstract public class Operator {
    
    /**
     * Precedence Values for each Operator type
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
     * @return double - a (operation) b
     */
    abstract public double evaluate(double a, double b);
    
    
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
