package STACK_QUEUE.EXPRESSION;

import java.util.Scanner;
import java.util.Stack;

/*
POSTFIX TO INFIX CONVERSION:
1)If ch==Operator -> take last two peeks(p1,p2) and popout p1,p2 and push new string "("+p2+ch+p1+")" to stack
2)If ch==Operand -> push to stack

TIME COMPLEXITY : O(N) + O(N)
SPACE COMPLEXITY : O(N)

 */

public class Postfix_To_Infix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the PostFix Expression : ");
        String postFixExpression = in.next();
        System.out.println("POSTFIX EXPRESSION FROM INFIX EXPRESSIONS : " +postFixToInfix(postFixExpression));
    }
    static String postFixToInfix(String postfixExpression){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<postfixExpression.length();i++){
            char ch = postfixExpression.charAt(i);
            if(ch=='^' || ch=='*' || ch=='/' || ch=='+' || ch=='-') {
                String p1=stack.pop();
                String p2=stack.pop();
                stack.push("("+p2+ch+p1+")");
            }else{
                stack.push(ch+"");
            }
        }
        return stack.peek();
    }
}
