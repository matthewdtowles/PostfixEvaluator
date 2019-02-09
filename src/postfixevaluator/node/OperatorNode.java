package postfixevaluator.node;

import postfixevaluator.operator.Operator;

/**
 * OperatorNode
 * Node with an Operator as data/value
 * @author matthew.towles
 * @date Feb 4, 2019
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
    
    
    /**
     * Evaluates data in this Node
     * Base case: left, right are leaf nodes (have no children)
     * operator.evaluate is arithmetic operation on leftVal and rightVal
     * @return 
     */
    @Override
    public int evaluate() {
        int leftVal = left.evaluate();
        int rightVal = right.evaluate();
        return operator.evaluate(leftVal, rightVal);
    }


    /**
     * Returns Node subtree in infix format
     * @return String - (leftVal operator rightVal)
     */
    @Override
    public String inOrderWalk() {
        String leftVal = left.inOrderWalk();
        String rightVal = right.inOrderWalk();
        return "(" + leftVal + " " + operator.getSymbol() + " " + rightVal + ")";
    }

    
    /**
     * Returns Node subtree in postfix format
     * @return String - leftVal rightVal operator
     */
    @Override
    public String postOrderWalk() {
        String leftVal = left.postOrderWalk();
        String rightVal = right.postOrderWalk();
        return leftVal + " " + rightVal + " " + operator.getSymbol();
    }
    
    
    /**
     * @return Operator - the operator
     */
    public Operator getOperator(){
        return operator;
    }
    
    
    /**
     * @return Node - this.left
     */
    public Node getLeft() {
        return left;
    }
    
    
    /**
     * @return Node - this.right 
     */
    public Node getRight() {
        return right;
    }

}
