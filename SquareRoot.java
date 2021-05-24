/*
Finding the square root of a number without using in-built functon:

Input:
9
Output:
3.0

Input:
30976
Output:
176.0

Input:
2.5
Output:
1.5811388

*/
import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float n=sc.nextFloat();
        sc.close();

        float temp;
        float sr=n/2;

        do{
            temp=sr;
            sr=(temp+(n/temp))/2;
        }while((temp-sr)!=0);

        System.out.println(sr);
    }
    
}
