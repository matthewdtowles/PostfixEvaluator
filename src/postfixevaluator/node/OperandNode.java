package postfixevaluator.node;

/**
 * OperandNode is a node with an operand value
 * Often times it is the leaf node on an
 * expression tree
 * 
 * @author matthew.towles
 * @date Feb 4, 2019
 */
public class OperandNode implements Node {

    private int value;
    
    
    /**
     * Constructor
     * @param value - data held by node
     */
    public OperandNode(int value) {
        this.value = value;
    }
    
    
    /**
     * @return this.value
     */
    @Override
    public int evaluate() {
        return value;
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
