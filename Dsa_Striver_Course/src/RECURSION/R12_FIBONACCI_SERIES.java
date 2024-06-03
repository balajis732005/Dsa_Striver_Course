package RECURSION;

import java.util.Scanner;
//TIME COMPLEXITY : 0(2^N) for every n , n-1 , n-2 .... there is 2 recursion calls
public class R12_FIBONACCI_SERIES {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        System.out.println("Nth FIBONACCI NUMBER : "+fibo(n));
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
