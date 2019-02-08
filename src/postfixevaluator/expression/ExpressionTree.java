package postfixevaluator.expression;

import java.util.Stack;
import postfixevaluator.node.Node;
import postfixevaluator.node.OperandNode;
import postfixevaluator.node.OperatorNode;
import postfixevaluator.operator.*;

/**
 * Expression Tree
 * Takes PostfixExpression as input 
 * Numbers become operandNodes
 * Operators become operatorNodes
 * Push Nodes to tokenStack and pop them
 * to build an expression tree
 * Save expression tree in Node tree
 * Build equation from tree and save that as a string
 * 
 * @author Matthew Towles
 * Feb 4, 2019
 */
public class ExpressionTree extends Expression {
    

    /**
     * Holds the ExpressionTree after build() called
     */
    private Stack<Node> tokenStack = new Stack<>();
    
    
    /**
     * The actual tree
     */
    private Node tree;
    
    
    /**
     * The equation representing the built expression tree
     */
    private String equation;
    
    
    /**
     * Constructor - calls the build method
     * @param expression 
     */
    public ExpressionTree(PostfixExpression expression) {
        build(expression);
    }
    
    
    /**
     * Builds ExpressionTree from PostfixExpression
     * @param expression 
     */
    private void build(PostfixExpression expression) {
        for (String tkn : expression.getEquation()) {
            if (isNumeric(tkn)) {
                OperandNode num = new OperandNode(Integer.parseInt(tkn));
                tokenStack.push(num);
            } else if (isOperator(tkn)) {
                Operator op;
                switch(tkn) {
                    case Operator.ADD_SYMBOL:
                        op = new AddOperator();
                        break;
                    case Operator.SUB_SYMBOL:
                        op = new SubOperator();
                        break;
                    case Operator.MUL_SYMBOL:
                        op = new MulOperator();
                        break;
                    case Operator.DIV_SYMBOL:
                        op = new DivOperator();
                        break;
                    default:
                        throw new RuntimeException(
                                "Could not evaluate operator: " + tkn
                        );
                }
                Node rightNode = tokenStack.pop();
                Node leftNode = tokenStack.pop();
                OperatorNode opNode = new OperatorNode(op, leftNode, rightNode);
                tokenStack.push(opNode);
            } else {
                throw new RuntimeException("Invalid symbol: " + tkn);
            }
        }
        tree = tokenStack.pop();
        equation = tree.inOrderWalk();
    }
    
    
    public Node getTree() {
        return tree;
    }
    
    public String getEquation() {
        return equation;
    }
}
