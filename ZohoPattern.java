/* Zoho Pattern printing question (Round 2 - 2021) 

Source: https://www.geeksforgeeks.org/zoho-interview-experience-off-campus-january-2021/

Input:
n = 4 

Output:
   0
  101
 21012
3210123

*/
import java.util.*;

public class ZohoPattern {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("n = ");
        int n=sc.nextInt();

        sc.close();

        int v=1,flag=0,u=1,flag1=0;
        for(int i=0;i<n;i++){
            
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<n;j++){
                if(i>0 && j>=n-i){
                    System.out.print(v);
                    v--;
                    flag=1;
                }
                if(j==n-1){
                    System.out.print("0");
                }
            }
            if(flag==1){
                v=i+1;
            }

            for(int l=0;l<n;l++){
                if(i>0 && l>=n-i){
                    System.out.print(u);
                    u++;
                    flag1=1;
                }
            }
            if(flag1==1){
                u=1;
            }
            System.out.println();
        }
    
    }
}
