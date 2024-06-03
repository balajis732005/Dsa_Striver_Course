package BASIC_MATH;

import java.util.Scanner;

public class B3_PALINDROME_NUMBER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        int dup=n;
        System.out.println("Length of number : "+(int)(Math.log10(n)+1));
        int rev=0;
        while(n>0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n /= 10;
        }
        if(rev==dup){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
    }
}
