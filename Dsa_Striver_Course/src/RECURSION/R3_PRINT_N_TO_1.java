package RECURSION;

import java.util.Scanner;

public class R3_PRINT_N_TO_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        recur(n);
    }
    static void recur(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        recur(num-1);
    }
}
