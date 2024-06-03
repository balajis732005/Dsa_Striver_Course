package BASIC_MATH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B5_PRINT_ALL_DIVISORS_IN_SORTED {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        ArrayList<Integer> divi=new ArrayList<>();
        System.out.println("DIVISORS : ");
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divi.add(i);
                if(n/i!=i){
                    divi.add(n/i);
                }
            }
        }
        Collections.sort(divi);
        System.out.println(divi);
    }
}
