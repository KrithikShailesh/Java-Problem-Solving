/* Print string of odd length in ‘X’ format

Given a string of odd length, print the string X format.
Examples : 

Input: 12345
Output:
1       5
  2   4
    3
  2   4
1       5 

Input: cat
Output:
c t
 a
c t

Input: tiger
Output:
t   r
 i e
  g
 i e
t   r

*/
import java.util.*;
public class oddPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        sc.close();

        int l=str.length();

        for(int i=0;i<l;i++){
            
            int j=l-1-i;

            for(int k=0;k<l;k++){

                if(k==i||k==j){
                    System.out.print(str.charAt(k));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
}   
