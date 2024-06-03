package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class S3_INSERTION_SORT {
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
        insertion_sort(arr,n);
        System.out.println("AFTER SORTING : "+Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr,int n){
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
