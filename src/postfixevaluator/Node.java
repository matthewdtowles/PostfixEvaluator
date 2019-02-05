/*
 * Matthew Towles
 * Feb 4, 2019
 * Four methods which must be implemented by all node types
 */
package postfixevaluator;

/**
 * Methods all types of nodes must implement
 * @author matthew.towles
 */
public interface Node {
    
    /**
     * Evaluates the data node is holding
     * @return double - data inside of node
     */
    public double evaluate();
    
    
    /**
     * Walk along node data:  op - left - right
     * @return String - data in op, left, right order
     */
    public String preOrderWalk();
    
    
    /**
     * Walk along node data:  left - op - right
     * @return String - data in left, op, right order
     */
    public String inOrderWalk();
    
    
    /**
     * Walk along node data:  left - right - op
     * @return String - data in left, right, op order
     */
    public String postOrderWalk();
}
