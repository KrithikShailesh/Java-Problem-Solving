/* Third Max Number - (Leetcode - 414)

Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


*/

import java.util.*;
public class ThirdMaxNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int l=sc.nextInt();

        int[] nums=new int[l];
        for(int i=0;i<l;i++){
            nums[i]=sc.nextInt();
        }

        sc.close();
        
        Set<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<l;i++){
            set.add(nums[i]);
        }
        
        List<Integer> ls=new ArrayList<Integer>();
        for(Integer i:set){
            ls.add(i);
        }
        
        int len=ls.size();
        
        if(ls.size()==1){
            System.out.println(ls.get(0));
        }
        else if(ls.size()==2){
            System.out.println(ls.get(1));
        }
         else if(l-3>=0){
             System.out.println(ls.get(len-3));
         }
         else{
             System.out.println(ls.get(len-1));
         }

    }
    
}
