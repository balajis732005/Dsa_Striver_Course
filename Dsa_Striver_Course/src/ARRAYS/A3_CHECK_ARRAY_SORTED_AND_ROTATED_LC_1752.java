package ARRAYS;

import java.util.Scanner;
//RIGHT ROTATION
public class A3_CHECK_ARRAY_SORTED_AND_ROTATED_LC_1752 {
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
                for(int j=i+1;j<n;j++){
                    if(j==n-1){
                        if(arr[j]>arr[0]){
                            check=false;
                            break;
                        }
                    }else{
                        if(arr[j]>arr[j+1] || arr[j]>arr[0]){
                            check=false;
                            break;
                        }
                    }
                }
            }
        }
        if(check){
            System.out.println("ARRAY IS SORTED AND ROTATED");
        }else{
            System.out.println("ARRAY IS NOT SORTED AND ROTATED");
        }
    }
}
