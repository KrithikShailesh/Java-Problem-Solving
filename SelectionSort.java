/*

Selection Sort [O(n^2)]:

Input:
5
5 4 3 2 1
Output:
After sort:
1 2 3 4 5

*/
import java.util.*;
public class SelectionSort{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();

        for(int i=0;i<n-1;i++){

            int min_ind=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                }
            }

            int temp=arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;

        }

        System.out.println("After Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}