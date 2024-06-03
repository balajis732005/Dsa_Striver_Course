package HASHING;

import java.util.Scanner;

public class H1_INTEGER_HASHING {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements  : ");
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] hash=new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
    }
}
