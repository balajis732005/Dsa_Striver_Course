package MATH;

import java.util.Arrays;
import java.util.Scanner;

public class Catalan_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth number : ");
        int n = in.nextInt();
        int[] catalan = new int[n+1];
        catalan[0]=1;
        catalan[1]=1;
        for(int i=2;i<=n;i++){
            catalan[i]=(catalan[i-1]*(4*i-2))/(i+1);
        }
        System.out.println(Arrays.toString(catalan));
    }
}
