package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class A5_LEFT_ROTATE_AN_ARRAY_BY_ONE_PLACE {
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
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        System.out.println("AFTER : "+Arrays.toString(arr));
    }
}
