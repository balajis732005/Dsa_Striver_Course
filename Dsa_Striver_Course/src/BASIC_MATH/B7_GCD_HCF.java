package BASIC_MATH;

import java.util.Scanner;

public class B7_GCD_HCF {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("BRUTTE FORCE : "+brutte_force_gcd(a,b));
        System.out.println("OPTIMAL : "+eulidian_gcd(a,b));
    }
    static int brutte_force_gcd(int a,int b){
        for(int i=Math.min(a,b);i>-1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    static int eulidian_gcd(int a,int b){
        while(a>0 && b>0){
            if(a>=b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}
