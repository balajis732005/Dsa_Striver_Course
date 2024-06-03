package SORTING;

import java.util.Scanner;
import java.util.Arrays;
//TIME COMPLEXITY : O(N^2)

public class S2_SELECTION_SORT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("BEFORE SORTING : "+Arrays.toString(arr));
        selection_sort(arr,n);
        System.out.println("AFTER SORTING : "+Arrays.toString(arr));
    }
    static void selection_sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int mini=i;
            boolean check=false;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                    check=true;
                }
            }
            if(check){
                int temp=arr[i];
                arr[i]=arr[mini];
                arr[mini]=temp;
            }
        }
    }
}
