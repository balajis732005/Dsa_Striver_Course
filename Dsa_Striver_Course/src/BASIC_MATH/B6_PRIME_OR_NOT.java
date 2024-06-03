package BASIC_MATH;

import java.util.Scanner;

public class B6_PRIME_OR_NOT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        int fact=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                fact++;
                if(n/i!=i){
                    fact++;
                }
            }
        }
        if(fact==2){
            System.out.println("PRIME");
        }else{
            System.out.println("NOT PRIME");
        }
    }
}
