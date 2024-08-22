package STACK_QUEUE.EXPRESSION;

import java.util.Scanner;
import java.util.Stack;

/*
POSTFIX TO INFIX CONVERSION:
NOTE :" star from end of the expression
1)If ch==Operator -> take last two peeks(p1,p2) and popout p1,p2 and push new string "("+p1+ch+p1+")" to stack
2)If ch==Operand -> push to stack

TIME COMPLEXITY : O(N) + O(N)
SPACE COMPLEXITY : O(N)

 */

public class Prefix_To_Infix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the PostFix Expression : ");
        String preFixExpression = in.next();
        System.out.println("POSTFIX EXPRESSION FROM INFIX EXPRESSIONS : " +preFixToInfix(preFixExpression));
    }
    static String preFixToInfix(String preFixExpression){
        Stack<String> stack = new Stack<>();
        for(int i=preFixExpression.length()-1;i>=0;i--){
            char ch=preFixExpression.charAt(i);
            if(ch=='^' || ch=='*' || ch=='/' || ch=='+' || ch=='-') {
                String p1=stack.pop();
                String p2=stack.pop();
                stack.push("("+p1+ch+p2+")");
            }else{
                stack.push(ch+"");
            }
        }
        return stack.peek();
    }
}
