package postfixevaluator.expression;

/**
 * PostfixExpression
 * Definition and model for a postfix equation
 * PostfixExpression is:  number number operation
 * E.g.:  23 2 +
 * Which is equivalent to:  23 + 2
 * Only numbers and operators allowed in equation
 * @author matthew.towles
 * @date Feb 5, 2019
 */
public class PostfixExpression extends Expression {
    
//    private String[] equation;
    
    
    /**
     * Constructor
     * Takes a String[] equation as input
     * Validates the input as formatted correctly
     * @param equation
     */
    public PostfixExpression(String[] equation) {
        validate(equation);
        this.equation = equation;
    }
    
    
    /**
     * Checks if equation has only valid tokens
     * If invalid token is found throw exception
     * and do not set this.equation
     * @param equation 
     */
    private void validate(String[] equation) {
        // lets at least catch the obvious invalid formatting
        if (!isNumeric(equation[0]) || !isNumeric(equation[1])) {
            throw new RuntimeException("Invalid postfix format.");
        }
        for(String tkn : equation) {
            if (!isValid(tkn)) {
                throw new RuntimeException("Invalid input: " + tkn);
            }
        }
    }
    
    
    /**
     * Check if a token is valid
     * Valid tokens are numbers and operators
     * @param tkn
     * @return boolean
     */
    @Override
    protected boolean isValid(String tkn) {
        return isOperator(tkn) || isNumeric(tkn);
    }
    
    
    /**
     * Returns this.equation as one string with spacing
     * @return String version of this.equation
     */
    @Override
    public String toString() {
        String output = "";
        for (String tkn : equation) {
            output += tkn + " ";
        }
        return output;
    }
    
    
    /**
     * @return this.equation
     */
    @Override
    public String[] getEquation() {
        return equation;
    }
}
