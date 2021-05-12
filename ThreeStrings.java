/* Given n strings the output should be 
Sample Input1:
3
JOHN
JOHNY
JANARDHAN
Sample Output1:
JJOJAN
OHHARD
NNYHAN

Sample Input2:
4
JOHN
JOHNY
JANARDHAN
MIKESPENCER
Sample Output2:
JJOJANMIKE
OHHARDSPE
NNYHANNCER
*/
import java.util.*;

public class ThreeStrings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        String[] arr=new String[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        sc.close();

        String str1="",str2="",str3="";

        for(int i=0;i<n;i++){
            String s=arr[i].substring(0,i+1);
            String val=arr[i].substring(i+1,arr[i].length());
            arr[i]=val;
            str1+=s;
        }

        for(int i=0;i<n;i++){
            String s=arr[i].substring(arr[i].length()-1-i,arr[i].length());
            String val=arr[i].substring(0,arr[i].length()-s.length());
            arr[i]=val;
            str2+=s;
        }

        for(int i=0;i<n;i++){
            str3+=arr[i];
        }

        System.out.println(str1);

        System.out.println(str3);

        System.out.println(str2);


    }
}