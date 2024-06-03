package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class A8_MOVE_ZEROS_LC_283 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        System.out.print("Enter the Elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("BEFORE : "+ Arrays.toString(arr));
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            System.out.println("THERE IS NO ZEROS IN THE ARRAY");
        }else{
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    j++;
                }
            }
        }
        System.out.println("AFTER : "+ Arrays.toString(arr));
    }
}
