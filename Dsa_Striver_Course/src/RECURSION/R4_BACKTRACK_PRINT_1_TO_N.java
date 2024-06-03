package RECURSION;

import java.util.Scanner;

public class R4_BACKTRACK_PRINT_1_TO_N {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        recur(n,n);
    }
    static void recur(int i,int n){
        if(i<1){
            return;
        }
        recur(i-1,n);
        System.out.println(i);
    }
}
