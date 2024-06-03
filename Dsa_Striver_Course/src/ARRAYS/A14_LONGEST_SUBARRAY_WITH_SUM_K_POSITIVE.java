package ARRAYS;

import java.util.Scanner;

public class A14_LONGEST_SUBARRAY_WITH_SUM_K_POSITIVE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        System.out.print("Enter the Elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the sum k : ");
        int k=in.nextInt();
        int i=0;
        int j=0;
        int sum=arr[0];
        int ans=0;
        while(i<n){
            if(sum<k){
                i++;
                if(i<n) {
                    sum+=arr[i];
                }
            }
            else if(sum>k){
                sum-=arr[j];
                j++;
            }
            else{
                ans=Math.max(ans,i-j+1);
                i++;
                if(i<n) {
                    sum+=arr[i];
                }
            }
        }
        System.out.println("LONGEST SUB-ARRAY WITH SUM K : "+ans);
    }
}
