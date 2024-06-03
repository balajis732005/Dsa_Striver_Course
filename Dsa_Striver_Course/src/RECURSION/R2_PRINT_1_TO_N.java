package RECURSION;

import java.util.Scanner;

public class R2_PRINT_1_TO_N {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        recur(1,n);
    }
    static void recur(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        recur(i+1,n);
    }
}
