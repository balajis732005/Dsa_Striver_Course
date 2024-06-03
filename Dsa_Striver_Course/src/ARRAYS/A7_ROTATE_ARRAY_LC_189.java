package ARRAYS;

import java.util.Scanner;
import java.util.Arrays;
//RIGHT ROTATION
public class A7_ROTATE_ARRAY_LC_189 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        System.out.print("Enter the Elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter No.Of Rotations  : ");
        int k=in.nextInt();
        k%=n;
        System.out.println("BEFORE : "+Arrays.toString(arr));
        reverse(arr,0,n-1-k);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        System.out.println("AFTER  : "+Arrays.toString(arr));
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
