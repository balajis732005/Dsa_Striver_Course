package RECURSION;

import java.util.*;

public class R13_SUBSEQUENCES {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        List<Integer> subseq = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsequences(0,arr,subseq,ans);
        System.out.println("SUBSEQUENCES : "+ans);
    }
    static void subsequences(int i,int[] arr,List<Integer> subseq,List<List<Integer>> ans){
        if(i>=arr.length){
            ans.add(new ArrayList<>(subseq));
            return;
        }
        subseq.add(arr[i]);
        subsequences(i+1,arr,subseq,ans);
        subseq.removeLast();
        subsequences(i+1,arr,subseq,ans);
    }
}
