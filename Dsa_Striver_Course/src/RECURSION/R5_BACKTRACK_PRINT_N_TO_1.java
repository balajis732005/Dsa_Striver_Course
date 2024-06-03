package RECURSION;

import java.util.Scanner;

public class R5_BACKTRACK_PRINT_N_TO_1 {
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
        recur(i+1,n);
        System.out.println(i);
    }
}
