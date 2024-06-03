package HASHING;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class H3_HASH_MAP {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements  : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hash.containsKey(arr[i])){
                hash.replace(arr[i],hash.get(arr[i])+1);
            }else {
                hash.put(arr[i], 1);
            }
        }
        System.out.println(hash);
        System.out.print("Enter the length of character array : ");
        int cn=in.nextInt();
        char[] carr=new char[cn];
        System.out.print("Enter the elements  : ");
        for(int i=0;i<cn;i++){
            carr[i]=in.next().charAt(0);
        }
        HashMap<Character,Integer> char_hash = new HashMap<>();
        for(int i=0;i<cn;i++){
            if(char_hash.containsKey(carr[i])){
                char_hash.put(carr[i],char_hash.get(carr[i])+1);
            }else{
                char_hash.put(carr[i],1);
            }
        }
        System.out.println(char_hash);
        //HASHSET Stores only Non-Duplicate Values
        HashSet<Integer> val=new HashSet<>();
        int[] dup={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        for(int i=0;i<dup.length;i++){
            val.add(dup[i]);
        }
        System.out.println(val);
    }
}
