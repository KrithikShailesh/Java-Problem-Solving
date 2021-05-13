/* String Decryption - Character Position

Sample Input1:
4l-9k-R6-7a-k2-3i-S1-l5-8c
Sample Output1:
SkillRack

Sample Input2:
6n-4t-1C-o2-d10-11y-t3-8a-o5-7C-n9
Sample Output2:
CottonCandy

*/

import java.util.*;
import static java.lang.System.*;

public class StringDecoding{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        sc.close();

        String[] arr=str.split("-");
        int l=arr.length;

        char[] res=new char[l];

        for(int i=0;i<l;i++){
            String arrstr=arr[i];
            String num="";
            char chr='\0';

            for(int j=0;j<arrstr.length();j++){
                if(Character.isDigit(arrstr.charAt(j))==true){
                    num+=arrstr.charAt(j);
                }
                if(Character.isAlphabetic(arrstr.charAt(j))==true){
                    chr=arrstr.charAt(j);
                }
            }

            res[Integer.parseInt(num)-1]=chr;

        }

        String ult="";

        for(int i=0;i<l;i++){
            ult+=res[i];
        }

        out.println(ult);




    }
}