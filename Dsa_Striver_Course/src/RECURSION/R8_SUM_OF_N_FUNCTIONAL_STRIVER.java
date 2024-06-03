package RECURSION;

import java.util.Scanner;

public class R8_SUM_OF_N_FUNCTIONAL_STRIVER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter thr limit : ");
        int n=in.nextInt();
        System.out.println("SUM : "+sum(n));
    }
    static int sum(int n){
        if(n==0){
            return n;
        }
        return n+sum(n-1);
    }
}
