package TEMPARARY;

import java.util.Scanner;

public class codeforce_2_10_05_2024 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            String s=in.next();
            int st=0;
            int en=s.length()-1;
            boolean check=true;
            while(st<en){
                if(s.charAt(st)!=s.charAt(en)){
                    check=false;
                    break;
                }
                st++;
                en--;
            }
            if(check){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                for(int i=s.length()-1;i>=0;i--){
                    System.out.print(s.charAt(i));
                }
                System.out.println();
            }
            t--;
        }
    }
}
/*
    YES
            forcodesec
    NO
            YES
    xxyxx
            YES
    oc
            NO
    YES
            undertale
    YES
            thtsiwm
NO
*/
