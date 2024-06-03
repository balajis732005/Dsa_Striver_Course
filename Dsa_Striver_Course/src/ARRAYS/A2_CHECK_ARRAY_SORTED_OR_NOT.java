package ARRAYS;

import java.util.Scanner;

public class A2_CHECK_ARRAY_SORTED_OR_NOT {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        System.out.print("Enter the Elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        boolean check=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("ARRAY IS SORTED");
        }else{
            System.out.println("ARRAY IS NOT SORTED");
        }
    }
}
