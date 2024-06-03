package TEMPARARY;

import java.util.HashSet;

public class leetcode_2_11_05_2024 {
    public static void main(String[] args) {

    }
    public int maxPointsInsideSquare(int[][] points, String s) {
        int[] hash=new int[s.length()];
        int h=0;
        while(h<s.length()){
            int ind=maxi(points,hash);
            System.out.println(ind);
            int z=hash.length-h;
            HashSet<Character> temp=new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(hash[i]==0){
                    temp.add(s.charAt(i));
                }
            }
            if(temp.size()==z){
                if(check(points[ind][0],points[ind][1],points,hash)){
                    return z;
                }
            }
            hash[ind]++;
            h++;
        }
        return 0;
    }
    int maxi(int[][] arr,int[] hash){
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(hash[i]==0 && Math.abs(arr[i][0])>Math.abs(arr[m][0])){
                m=i;
            }
            if(hash[i]==0 && Math.abs(arr[i][1])>Math.abs(arr[m][1])){
                m=i;
            }
        }
        return m;
    }
    boolean check(int f,int s,int[][] arr,int[] hash){
        for(int i=0;i<arr.length;i++){
            if(hash[i]==1){
                if(Math.abs(arr[i][0])==Math.abs(f) || Math.abs(arr[i][1])==Math.abs(s)){
                    return false;
                }
            }
        }
        return true;
    }
}
