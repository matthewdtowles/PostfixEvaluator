package postfixevaluator.expression;

import java.util.ArrayList;
import java.util.List;

/**
 * Expression 
 * Arithmetic expression or equation
 * @author matthew.towles
 * @date Feb 5, 2019
 */
abstract public class Expression {
    
    /**
     * The actual equation that this represents
     */
    protected List<String> equation = new ArrayList<>();
    
    
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
}
