package ARRAYS;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A9_UNION_OF_TWO_SORTED_ARRAYS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of Array 1 : ");
        int n1=in.nextInt();
        System.out.print("Enter the length of Array 2 : ");
        int n2=in.nextInt();
        System.out.println("Enter the Sorted Array 1 : ");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the Sorted Array 2 : ");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=in.nextInt();
        }
        int i=0;
        int j=0;
        List<Integer> list=new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(list.size()==0 || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j<n2){
            if(list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.println("UNION : "+list);
    }
}
