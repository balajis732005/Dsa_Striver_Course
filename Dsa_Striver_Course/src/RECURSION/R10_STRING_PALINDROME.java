package RECURSION;

import java.util.Scanner;

public class R10_STRING_PALINDROME {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=in.next();
        System.out.print("PALINDROME : "+palin(s,0));
    }
    static boolean palin(String s,int i){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return palin(s,i+1);
    }
}
