/*
Searching - O(n) 

This is just a concept I thought about.

While adding elements to a place if we determine the place we want to store that particular element using a general formula.

Then while searching for the element we can access that particular element using that formula in O(n).

*/

import java.util.*;

public class EfficientSearch {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        char[] arr=new char[26];
        String str="";
        
        
        do{
            char ch=sc.next().charAt(0);

            arr[ch-97]=ch;

            System.out.println("Do you want to add another element??[Y/N]");
            str=sc.next();

        }while(str.equalsIgnoreCase("Y"));

        System.out.println("Enter the search element:");
        char sear=sc.next().charAt(0);

        if(sear==arr[sear-97]){
            System.out.println("Found");
        }

        sc.close();

    }
    
}
