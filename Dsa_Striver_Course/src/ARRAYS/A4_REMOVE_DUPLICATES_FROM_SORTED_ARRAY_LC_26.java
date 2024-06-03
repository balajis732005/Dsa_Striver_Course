package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class A4_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_LC_26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        System.out.print("Enter the Elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("BEFORE : "+Arrays.toString(arr));
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        System.out.println("AFTER : "+Arrays.toString(arr));
        System.out.println("NO.OF UNIQUE ELEMENTS : "+(i+1));
    }
}
