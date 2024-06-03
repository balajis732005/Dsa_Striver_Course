
import java.util.Scanner;

public class codeforce_1_17_05_2024 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int[] arr = {a,b,c};
            if((a==b && b==c && a==c) && (a!=0 && b!=0 && c!=0)){
                System.out.println(-1);
                t--;
                continue;
            }
            int ind=0;
            int maxi=arr[0];
            if(arr[1]>maxi){
                maxi=arr[1];
                ind=1;
            }
            if(arr[2]>maxi){
                maxi=arr[2];
                ind=2;
            }
            int draw=0;
            while(arr[0]>=0 && arr[1]>=0 && arr[2]>=0){
                arr[ind]-=2;
                for(int i=0;i<3;i++){
                    if(i!=ind){
                        arr[i]--;
                        if(arr[i]>=0){
                            draw+=1;
                        }
                    }
                    if(arr[0]>maxi){
                        maxi=arr[0];
                        ind=0;
                    }
                    else if(arr[1]>maxi){
                        maxi=arr[1];
                        ind=1;
                    }
                    else if(arr[2]>maxi){
                        maxi=arr[2];
                        ind=2;
                    }
                }
            }
            System.out.println(draw);
            t--;
        }
    }
}
