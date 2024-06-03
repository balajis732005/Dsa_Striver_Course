package SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class S5_QUICK_SORT {
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
        quick_sort(arr,0,n-1);
        System.out.println("AFTER SORTING : "+Arrays.toString(arr));
    }
    static void quick_sort(int[] arr,int low,int high) {
        if (low < high) {
            int partition = place_pivot(arr, low, high);
            quick_sort(arr,low,partition-1);
            quick_sort(arr,partition+1,high);
        }
    }
    static int place_pivot(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high-1 && arr[i]<=pivot) {
                i++;
            }
            while(j>=low+1 && arr[i]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp1=arr[low];
        arr[low]=arr[j];
        arr[j]=temp1;
        return j;
    }
}
