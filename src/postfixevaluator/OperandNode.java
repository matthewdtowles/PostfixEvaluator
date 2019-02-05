/*
 * Matthew Towles
 * Feb 4, 2019
 * Node with an operand as value
 */

package postfixevaluator;

/**
 * OperandNode is a node with an operand value
 * Often times it is the leaf node on an
 * expression tree
 * 
 * @author matthew.towles
 */
public class OperandNode implements Node {

    private double value;
    
    
    /**
     * Constructor
     * @param value - data held by node
     */
    public OperandNode(double value) {
        this.value = value;
    }
    
    
    /**
     * @return double - this.value
     */
    @Override
    public double evaluate() {
        return value;
    }

    
    /**
     * Implemented from Node
     * Same as inOrderWalk and postOrderWalk
     * @return String - value in string form
     */
    @Override
    public String preOrderWalk() {
        return String.valueOf(value);
    }

    
    /**
     * Implemented from Node
     * Same function as preOrderWalk and postOrderWalk
     * @return String - value in string form
     */
    @Override
    public String inOrderWalk() {
        return String.valueOf(value);    
    }

    
    /**
     * Implemented from Node
     * Same as inOrderWalk and preOrderWalk
     * @return String - value in string form
     */
    @Override
    public String postOrderWalk() {
        return String.valueOf(value);
    }

}
