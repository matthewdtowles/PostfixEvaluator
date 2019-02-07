package postfixevaluator;

/**
 * Exception that is thrown if division by zero detected
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class DivideByZero extends Exception {

    DivideByZero(String ex) {
        super(ex);
    }
    
}
