package postfixevaluator.node;

/**
 * Methods all types of nodes must implement
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public interface Node {
    
    /**
     * Evaluates the data node is holding
     * @return int - data inside of node
     */
    public int evaluate();
      
    
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
