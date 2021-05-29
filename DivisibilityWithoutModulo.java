/*
Program to check is a number is divisible by another without using modulo operator

Input:
256
13
Output:
Not Divisible

Input:
260
13
Output:
Divisible

 */
import java.util.*;

public class DivisibilityWithoutModulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        float div=sc.nextFloat();
        sc.close();
        
        int val=num/(int)div;
        float va=num/div;

        if(va-val > 0){
            System.out.println("Not Divisible");
        }
        else{
            System.out.println("Divisible");
        }

    }
    
}
