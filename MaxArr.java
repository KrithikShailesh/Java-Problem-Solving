/*Finding the Maximum Product in order N. */

import java.util.*;

public class MaxArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the array:");

        int l=sc.nextInt();

        int[] arr=new int[l];

        for(int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();
        
        for(int i=0;i<l-1;i++){

            if(arr[i]>arr[i+1]){
                
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

                i=-1;
            }

        }

        System.out.println("The Maximum product is "+arr[l-1]*arr[l-2]+".");
    }
    
}
