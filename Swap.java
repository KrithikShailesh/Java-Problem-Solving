/*
Swap using XOR Operator:

Input:
10 20
Output:
After Swap:
20 10

 */
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.close();

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("After Swap:"+"\n"+x+" "+y);

    }
    
}
