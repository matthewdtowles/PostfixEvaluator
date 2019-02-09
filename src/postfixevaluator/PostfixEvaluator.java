package postfixevaluator;

import java.util.ArrayList;
import java.util.List;
import postfixevaluator.expression.PostfixExpression;

/**
 * PostfixEvaluator
 * Evaluates postfix expression given as raw input
 * Breaks input into char array
 * Parses char array and creates a token list
 * Parses token list to create a well defined
 * PostfixExpression structure
 * This is done to ensure a valid PostfixExpression
 * is handled by the expression tree which
 * translates it into infix and 3-Address instructions
 * @author matthew.towles
 * @date Feb 5, 2019
 */
public class PostfixEvaluator {
    
    /**
     * Char array of user input
     */
    private char[] userInputChars;
    
    /**
     * List of strings aka Tokens
     * Made from char array of user input
     * Input to PostfixExpression data type
     */
    private List<String> tokens = new ArrayList<>();
    
    /**
     * Formatted and validated postfix expression
     */
    private PostfixExpression expression;
    
    
    /**
     * Constructor
     * Converts userInput -> userInputChars
     * -> list of strings aka tokens
     * -> expression, our PostfixExpression
     * @param userInput 
     */
    public PostfixEvaluator(String userInput) {
        userInputChars = userInput.toCharArray();
        tokenize();
        expression = new PostfixExpression(tokens);
    }
    
    
    /**
     * Getter
     * @return PostfixExpression expression
     */
    public PostfixExpression getExpression() {
        return expression;
    }
    
    
    /**
     * Calls getToken() to get all chars into token form
     * All tokens added to tokens
     */
    private void tokenize() {
        for (int i = 0; i < userInputChars.length; i++) {
            String tkn = getNextToken(i);
            // dont add spaces to tokens array list
            if (!tkn.equals(" ")) {
                tokens.add(tkn);
            }
            i += tkn.length() - 1;
        }
    }


    /**
     * Returns next token in userInputChars
     * Accounts for integers with more than one digit
     * Uses Recursion
     *
     * @param i - iterator
     * @return string - the token at position i
     */
    private String getNextToken(int i) {
        // current character at time of calling:
        String token = Character.toString(userInputChars[i]);

        // check if base case reach and both chars are digits
        if (i < userInputChars.length - 1
                && Character.isDigit(userInputChars[i])
                && Character.isDigit(userInputChars[i + 1])
           ) {
            return token.concat(getNextToken(i + 1));
        }
        // base case
        return token;
    }
    
    
}
