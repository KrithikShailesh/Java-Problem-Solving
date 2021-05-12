/* Given a String print the longest possible palindrome
Sample input1:
bala
Sample output1:
ala
Sample output2:
javamalayalam
Sample output2:
malayalam
*/
import java.util.*;

public class LongestPalindrome{
    static boolean isPalindrome(String s){
        int l=s.length();
        int j=l-1;
        int flag=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)==s.charAt(j)){
                flag=1;
            }
            else{
                flag=0;
                break;
            }

            j--;
        }

            if(flag==1){
                return true;
            }
            else{
                return false;
            }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();

        sc.close();

        int len=str.length();
        
        int flag=0;
        String s="";
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
                if(str.charAt(i)==str.charAt(j)){
                    s=str.substring(i,j+1);
                    if(isPalindrome(s)==false){
                        flag=0;
                        break;
                    }
                    else{
                        flag=1;
                    }
                }
            }
            if(flag==1){
                System.out.println(s);
                break;
                
            }

        }
    }
}