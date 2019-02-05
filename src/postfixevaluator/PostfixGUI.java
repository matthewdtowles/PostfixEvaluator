/*
 * Matthew Towles
 * Feb 4, 2019
 * Accepts arithmetic of unsigned integers
 * in postfix notation and builds expression tree.
 * From expression tree, an infix expression is
 * built and then displayed in GUI
 * 
 * Postfix example:  3 5 9 +- 2 3 * /
 * As infix:         ((3 - (5 + 9)) / (2 * 3))
 * As 3-address:     Add R0 5 9
 *                   Sub R1 3 R0
 *                   Mul R2 2 3
 *                   Div R3 R1 R2
 */
package postfixevaluator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * GUI and main class for Postfix Evaluator
 * @author matthew.towles
 */
public class PostfixGUI extends JFrame {
    
    private JLabel inputLabel;
    private JTextField inputField;
    private JButton submitButton;
    private JLabel resultLabel;
    private JTextArea resultText;
    
    
    /**
     * Constructor - calls init() to initialize GUI
     */
    public PostfixGUI() {
        init();
    }
    
    /**
     * Initialize the GUI and its fields
     */
    private void init() {
        inputLabel = new JLabel();
        inputField = new JTextField();
        submitButton = new JButton();
        resultLabel = new JLabel();
        resultText = new JTextArea();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        inputLabel.setText("Enter postfix expression: ");
        resultLabel.setText("Infix expression: ");
        submitButton.setText("Construct Tree");
        submitButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ev) {
               submitButtonActionPerformed(ev);
           } 
        });
        
        // make the GUI:
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(
                        layout.createParallelGroup(
                            GroupLayout.Alignment.LEADING
                        )
                        .addComponent(inputLabel)
                        .addComponent(resultLabel)
                    )
                    .addGap(15, 15, 15)
                    .addGroup(
                        layout.createParallelGroup(
                            GroupLayout.Alignment.LEADING, false
                        )
                        .addComponent(submitButton)
                        .addComponent(inputField, 
                                GroupLayout.DEFAULT_SIZE, 
                                223, 
                                Short.MAX_VALUE
                        )
                        .addComponent(resultText, 
                                GroupLayout.Alignment.TRAILING, 
                                GroupLayout.DEFAULT_SIZE, 
                                GroupLayout.DEFAULT_SIZE, 
                                Short.MAX_VALUE
                        )
                    )
                    .addContainerGap(14, Short.MAX_VALUE)
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(
                    layout.createParallelGroup(
                        GroupLayout.Alignment.BASELINE
                    )
                    .addComponent(inputLabel)
                    .addComponent(inputField, 
                            GroupLayout.PREFERRED_SIZE, 
                            GroupLayout.DEFAULT_SIZE, 
                            GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGap(15, 15, 15)
                .addComponent(submitButton)
                .addGap(15, 15, 15)
                .addGroup(
                    layout.createParallelGroup(
                        GroupLayout.Alignment.BASELINE
                    )
                    .addComponent(resultLabel)
                    .addComponent(resultText)
                )
                .addContainerGap(15, Short.MAX_VALUE)
            )
        );
        pack();
    }
    
    
    /**
     * Event listener for the construct tree button
     * Calls methods to construct expression tree,
     * displays the corresponding infix expression,
     * and writes an instruction file in 3-Address assembly format
     * 
     * @param ev 
     */
    private void submitButtonActionPerformed(ActionEvent ev) {
        // build tree or whatever happens when you click the button
    }
    
    
    /**
     * Main class
     * @param args 
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PostfixGUI().setVisible(true);
            }
        });
        
        Operator add = new AddOperator();
        System.out.println("prec: " + add.getPrecedence());
    }
}
