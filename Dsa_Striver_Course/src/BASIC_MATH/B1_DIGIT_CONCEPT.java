package BASIC_MATH;

import java.util.Scanner;

public class B1_DIGIT_CONCEPT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        System.out.println("Length of number : "+(int)(Math.log10(n)+1));
        while(n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
}
