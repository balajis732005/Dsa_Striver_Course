package RECURSION;

import java.util.Scanner;

public class R1_PRINT_N_TIMES {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=in.next();
        System.out.print("Enter no.of times : ");
        int n=in.nextInt();
        recur(1,n,s);
    }
    static void recur(int i,int n,String s){
        if(i>n){
            return;
        }
        System.out.println(s);
        recur(i+1,n,s);
    }
}
