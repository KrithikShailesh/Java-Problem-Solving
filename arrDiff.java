import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class arrDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        Integer[] arr1=new Integer[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);

        int n2=sc.nextInt();
        Integer[] arr2=new Integer[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr2);

        List<Integer> l1=Arrays.asList(arr1);
        List<Integer> l2=Arrays.asList(arr2);

        int max=n1>n2?n1:n2;
        int count=0;
        
        for(int i=0;i<max;i++){

            
            if(!(l2.contains(l1.get(i)))){
                count++;
            }

            

        }

        System.out.println(count);
    }
    
}
