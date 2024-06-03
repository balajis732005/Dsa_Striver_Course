package HASHING;

import java.util.Arrays;
import java.util.Scanner;

public class H2_CHARACTER_HASHING {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of character array : ");
        int n=in.nextInt();
        char[] arr=new char[n];
        System.out.print("Enter the elements  : ");
        for(int i=0;i<n;i++){
            arr[i]=in.next().charAt(0);
        }
        int[] hash=new int[26];
        for(int i=0;i<n;i++){
            hash[arr[i]-'a']++;
        }
        System.out.println(Arrays.toString(hash));
    }
}
