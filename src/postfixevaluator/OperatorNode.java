/*
 * Matthew Towles
 * Feb 4, 2019
 * Node with an Operator as data/value
 */

package postfixevaluator;

/**
 *
 * @author matthew.towles
 */
public class OperatorNode implements Node {

    /**
     * Left child which is a Node
     */
    private Node left;
    
    /**
     * Right child which is a node
     */
    private Node right;
    
    /**
     * Operator value this OperatorNode holds
     */
    private Operator operator;
    
    
    /**
     * Constructor
     * @param operator - operator object
     * @param left - node that will be left child
     * @param right - node that will be right child
     */
    public OperatorNode(Operator operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }
    
    
    
    
    @Override
    public double evaluate() {
        double leftVal = left.evaluate();
        double rightVal = right.evaluate();
        return operator.evaluate(leftVal, rightVal);
    }

    @Override
    public String preOrderWalk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String inOrderWalk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String postOrderWalk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
