package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class S1_BUBBLE_SORT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("BEFORE SORTING : "+ Arrays.toString(arr));
        bubble_sort(arr,n);
        System.out.println("AFTER SORTING : "+Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
