package RECURSION;

import java.util.Scanner;
import java.util.Arrays;

public class R6_REVERSE_THE_ARRAY {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        rev(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr,int i){
        if(i>=(arr.length)/2){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
        rev(arr,i+1);
    }
}
