package ARRAYS;

import java.util.Scanner;

public class A1_FIRST_SECOND_LARGEST {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int flargest=arr[0];
        int slargest=-1; // if and only if there is no negative numbers in the arary
        // if there is negative numbers in the array then , slargest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++) {
            if (arr[i] > flargest) {
                slargest = flargest;
                flargest = arr[i];
            } else if (arr[i]<flargest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println("FIRST LARGEST : "+flargest);
        System.out.println("SECOND LARGEST : "+slargest);
    }
}
