package STACK_QUEUE.EXPRESSION;

import java.util.Scanner;
import java.util.Stack;
/*
INFIX TO POSTFIX CONVERSION:
1)If ch=='(' -> push to stack
2)If ch==')' -> popout all in stack and push to answer until we got '(' and finally pop '(' also
3)If ch==Operator -> popout all in stack and push to answer which are greater or equal priority as compared to ch
                    and finally push ch in stack
4)If ch==Operand -> push to answer

TIME COMPLEXITY : O(N) + O(N)
SPACE COMPLEXITY : O(N) + O(N)

 */

public class Infix_To_Postfix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Infix Expression : ");
        String infixExpression = in.next();
        System.out.println("POSTFIX EXPRESSION FROM INFIX EXPRESSIONS : " +InfixToPostFix(infixExpression));
    }
    static int getPriority(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }
        return -1;
    }
    static String InfixToPostFix(String infixExpression) {
        StringBuilder postFixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.empty() && stack.peek()!='('){
                    postFixExpression.append(stack.pop());
                }
                stack.pop();
            }
            else if(ch=='^' || ch=='*' || ch=='/' || ch=='+' || ch=='-') {
                while(!stack.empty() && getPriority(ch)<=getPriority(stack.peek())){
                    postFixExpression.append(stack.pop());
                }
                stack.push(ch);
            }else{
                postFixExpression.append(ch);
            }
        }
        while(!stack.empty()){
            postFixExpression.append(stack.pop());
        }
        return postFixExpression.toString();
    }
}
