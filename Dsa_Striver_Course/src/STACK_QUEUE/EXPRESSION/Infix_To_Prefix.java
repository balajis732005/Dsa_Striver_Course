package STACK_QUEUE.EXPRESSION;

/*
INFIX TO PREFIX CONVERSION:

1)Reverse the Given Infix Expression
2)Do Infix to Postfix Conversion with small change in during ch==operator {
    If ch=='^' -> popout all in stack and push to answer which are greater or equal(>=) priority as compared to ch
    Else If ch==Operator -> popout all in stack and push to answer which are greater(>) than priority as compared to ch
}
3)Reverse the Final Answer

TIME COMPLEXITY : O(N) + O(N)
SPACE COMPLEXITY : O(N) + O(N)

 */

import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Prefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Infix Expression : ");
        String infixExpression = in.next();
        StringBuilder builder = new StringBuilder(infixExpression);
        for(int i=0;i<builder.length();i++){
            if(builder.charAt(i)=='('){
                builder.setCharAt(i,')');
            }else if(builder.charAt(i)==')'){
                builder.setCharAt(i,'(');
            }
        }
        System.out.println("POSTFIX EXPRESSION FROM INFIX EXPRESSIONS : " +InfixToPreFix(builder.reverse().toString()));
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
    static String InfixToPreFix(String infixExpression) {
        StringBuilder preFixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.empty() && stack.peek()!='('){
                    preFixExpression.append(stack.pop());
                }
                if(!stack.empty()){
                    stack.pop();
                }
            }
            else if(ch=='^' || ch=='*' || ch=='/' || ch=='+' || ch=='-') {
                if(ch=='^') {
                    while(!stack.empty() && getPriority(ch)<=getPriority(stack.peek())){
                        preFixExpression.append(stack.pop());
                    }
                }else{
                    while(!stack.empty() && getPriority(ch)<getPriority(stack.peek())){
                        preFixExpression.append(stack.pop());
                    }
                }
                stack.push(ch);
            }else{
                preFixExpression.append(ch);
            }
            System.out.println(stack+" "+preFixExpression);
        }
        while(!stack.empty()){
            preFixExpression.append(stack.pop());
        }
        return preFixExpression.reverse().toString();
    }
}
