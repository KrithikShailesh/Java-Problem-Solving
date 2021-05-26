/*
Leetcode-1021. Remove Outermost Parentheses

A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

Example 1:

Input: s = "(()())(())"
Output: "()()()"

Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"

Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:

Input: s = "()()"
Output: ""

Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".

*/
import java.util.*;

public class RemoveOuterParanthesis {
    static String removeOuterParentheses(String s) {

        Stack<Character> st=new Stack();
        List<Integer> l=new ArrayList<>();
        
        int len=s.length();
        char[] ch=s.toCharArray();
        
        for(int i=0;i<len;i++){
            if(st.size()==0){
                st.push(ch[i]);
                l.add(i);
                continue;
            }
            if(ch[i]=='(' && st.peek()==')'){
                st.pop();
                if(st.size()==0){
                    l.add(i);
                }
            }
             if(ch[i]==')' && st.peek()=='('){
                st.pop();
                if(st.size()==0){
                    l.add(i);
                }
            }
            else{
                st.push(ch[i]);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<l.size()-1;i+=2){
            sb.append(s.substring(l.get(i)+1,l.get(i+1)));
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        sc.close();

        System.out.println(removeOuterParentheses(str));

    }
    
}
