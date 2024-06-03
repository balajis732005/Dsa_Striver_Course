package RECURSION;

import java.util.Scanner;

public class R7_SUM_OF_N_FUNCTIONAL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter thr limit : ");
        int n=in.nextInt();
        System.out.println("SUM : "+sum(n,0));
    }
    static int sum(int i,int sum){
        if(i<1){
            return sum;
        }
        return sum(i-1,sum+i);
    }
}

