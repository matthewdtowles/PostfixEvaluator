/*
 * Matthew Towles
 * Feb 1, 2019
 * 
 */

package postfixevaluator;

/**
 *
 * @author matthew.towles
 */
abstract public class Operator {
    
    // extended by:  AddOperator, MulOperator, SubOperator, DivOperator
   
    // operators should have precedence
    
    
    // 2 params
    // execute op for this operator on them
    // implemented by child classes - i.e.: AddOperator implements addition 
    // in its eval method
    public void evaluate() {}
}
