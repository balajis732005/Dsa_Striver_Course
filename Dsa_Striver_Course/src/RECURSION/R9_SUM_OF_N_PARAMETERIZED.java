package RECURSION;

import java.util.Scanner;

public class R9_SUM_OF_N_PARAMETERIZED {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter thr limit : ");
        int n=in.nextInt();
        sum(n,0);
    }
    static void sum(int i,int sum){
        if(i<1){
            System.out.println("SUM : "+sum);
            return;
        }
        sum(i-1,sum+i);
    }
}
