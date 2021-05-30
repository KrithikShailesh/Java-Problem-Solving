/*
 Reversing a String using Stack

 Input:
 Krithik
 Output:
 kihtirK

 Input:
 Same
 Output:
 emaS

 */

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        sc.close();

        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){

            st.push(str.charAt(i));

        }

        for(int i=0;i<str.length();i++){

            System.out.print(st.peek());
            st.pop();

        }

    }
}
