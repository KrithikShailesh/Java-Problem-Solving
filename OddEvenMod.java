/*
 Even or Odd (Without Modulo Operator)

 Input:
 9
 Output:
 Odd

 Input:
 8
 Output:
 Even
 
 */
import java.util.*;

public class OddEvenMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num= sc.nextInt();
        sc.close();

        int val= num & 1;

        if(val == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }

    }
    
}
