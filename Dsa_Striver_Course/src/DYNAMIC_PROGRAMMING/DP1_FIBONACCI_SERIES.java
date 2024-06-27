package DYNAMIC_PROGRAMMING;

import java.util.Arrays;
import java.util.Scanner;

public class DP1_FIBONACCI_SERIES {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        long[] dp=new long[n+1];
        dp=Arrays.stream(dp).map(i->-1).toArray();
        System.out.println("Nth FIBONACCI NUMBER : "+fibo(n,dp));
    }
    static long fibo(int n,long[] dp){
        if(n<=1){
            dp[n]=n;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
}
