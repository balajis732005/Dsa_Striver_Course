package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class S4_MERGE_SORT {
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
        merge_sort(arr,0,n-1);
        System.out.println("AFTER SORTING : "+Arrays.toString(arr));
    }
    static void merge_sort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int start,int mid,int end){
        List<Integer> temp=new ArrayList<>();
        int i=start;
        int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        for(int k=start;k<=end;k++){
            arr[k]=temp.get(k-start);
        }
    }
}