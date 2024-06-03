package TEMPARARY;

import java.util.List;
import java.util.ArrayList;

public class temp {
    public static void main(String[] args) {
        String word="leetcoleet";
        int k=2;
        List<String> sub=new ArrayList<>();
        for(int i=0;i<word.length();i+=k){
            sub.add(word.substring(i,i+k));
        }
        System.out.println(sub);
        int[] hash=new int[sub.size()];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<sub.size();i++){
            if(hash[i]!=0){
                continue;
            }
            int temp=0;
            for(int j=0;j<sub.size();j++){
                if(j!=i && !sub.get(i).equals(sub.get(j))){
                    temp++;
                }else{
                    hash[j]++;
                }
            }
            System.out.println("t:"+temp);
            if(temp<ans){
                ans=temp;
            }
        }
        System.out.println("ans:"+ans);
    }
}
