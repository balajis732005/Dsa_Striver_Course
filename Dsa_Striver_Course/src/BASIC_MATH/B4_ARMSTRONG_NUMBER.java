package BASIC_MATH;

import java.util.Scanner;

public class B4_ARMSTRONG_NUMBER {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        int dup=n;
        int len=(int)(Math.log10(n)+1);
        System.out.println("Length of number : "+len);
        int sum=0;
        while(n>0) {
            int last = n % 10;
            sum = sum + (int)(Math.pow(last,len));
            n /= 10;
        }
        if(sum==dup){
            System.out.println("ARMSTRONG");
        }else{
            System.out.println("NOT ARMSTRONG");
        }
    }
}
