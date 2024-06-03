package RECURSION;

import java.util.Scanner;

public class R11_FACTORIAL_OF_N {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter thr number : ");
        int n=in.nextInt();
        System.out.println("FACTORIAL : "+fact(n));
    }
    static int fact(int n){
        if(n==0){
            return 1; // if we return 0 then entire product will be zero
        }
        return n*fact(n-1);
    }
}
