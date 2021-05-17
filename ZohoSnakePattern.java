/* Zoho Snake Pattern without using arrays and if statements.

Input: 4

Output:

 	 	 	1	2	3	4
 	 	8	7	6	5	 
 	9	10	11	12	 	 
16	15	14	13	 

*/

import java.util.*;

public class ZohoSnakePattern {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        sc.close();

        int val=1;

        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("   ");
            }
            for(int k=0;i%2==0 && k<n;k++){
                String space=val/10>0 ? " " : "  ";
                System.out.print(val+space);
                val++;
            }
            int val1=val+n-1;
            for(int l=0;val>n && i%2!=0 && l<n;l++){
                String space= val1/10>0 ? " " : "  ";
                System.out.print(val1+space);
                val1--;
                val=val1+n+1;
            }
            System.out.println();
            
        }
    }
}
