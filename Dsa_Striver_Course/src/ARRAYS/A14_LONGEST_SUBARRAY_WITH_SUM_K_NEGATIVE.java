package ARRAYS;

import java.util.HashMap;
import java.util.Scanner;

public class A14_LONGEST_SUBARRAY_WITH_SUM_K_NEGATIVE {
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
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(!hash.containsKey(sum)){
                hash.put(sum,i);
            }
            if(sum==k){
                ans=Math.max(ans,i+1);
            }else {
                if (hash.containsKey(sum - k)) {
                    ans = Math.max(ans, i - hash.get(sum - k));
                }
            }
        }
        System.out.println("USED HASHMAP "+hash);
        System.out.println("LONGEST SUB-ARRAY WITH SUM K : "+ans);
    }
}
