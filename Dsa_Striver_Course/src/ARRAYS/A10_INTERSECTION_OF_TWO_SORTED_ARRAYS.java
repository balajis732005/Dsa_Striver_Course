package ARRAYS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A10_INTERSECTION_OF_TWO_SORTED_ARRAYS {
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
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println("INTERSECTION : "+list);
    }
}
