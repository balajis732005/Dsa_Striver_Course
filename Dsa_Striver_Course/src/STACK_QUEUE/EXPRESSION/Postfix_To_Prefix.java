package STACK_QUEUE.EXPRESSION;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_To_Prefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the PostFix Expression : ");
        String postFixExpression = in.next();
        System.out.println("POSTFIX EXPRESSION FROM INFIX EXPRESSIONS : " +postFixToPrefix(postFixExpression));
    }
    static String postFixToPrefix(String postFixExpression){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<postFixExpression.length();i++){
            char ch = postFixExpression.charAt(i);
            if(ch=='^' || ch=='*' || ch=='/' || ch=='+' || ch=='-') {
                String p1=stack.pop();
                String p2=stack.pop();
                stack.push(ch+p2+p1);
            }else{
                stack.push(ch+"");
            }
        }
        return stack.peek();
    }
}
