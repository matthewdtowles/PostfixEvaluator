package postfixevaluator.expression;

/**
 * Expression 
 * Arithmetic expression or equation
 * @author matthew.towles
 * @date Feb 5, 2019
 */
abstract public class Expression {
    
    /**
     *
     */
    protected String[] equation;
    
    
    /**
     * Returns true if argument is a number
     * @param tkn - string
     * @return boolean
     */
    protected boolean isNumeric(String tkn) {
        return tkn.matches("^[0-9]*$");
    }


    /**
     * Returns true if argument is a valid operator
     * @param tkn - string
     * @return boolean
     */
    protected boolean isOperator(String tkn) {
        return tkn.matches("^[+*/\\-]*$");
    }
    
    
    /**
     * Check if a token is valid for expression
     * @param tkn
     * @return boolean
     */
    abstract protected boolean isValid(String tkn);
    
    
    /**
     * Getter - to be implemented by subclasses
     * @return this.equation 
     */
    abstract public String[] getEquation();
    
}
