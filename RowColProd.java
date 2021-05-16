/* Zig-Zag Product Row

Example Input/Output 1:

Input: 
4 6 
1 1 5 3 3 2 
7 4 3 7 6 8 
9 9 5 2 3 9 
8 1 6 9 3 7 
2 4 

Output: 
49 12 27 42 6 64 

Explanation: 
Here X = 2 and Y = 4. 
The second row of the matrix contains 7 4 3 7 6 8. 
The fourth row of the matrix contains 8 1 6 9 3 7. 
The product of the integers in the 2nd row (left to right) and 4th row (right to left) is given below. 
(7*7) (4*3) (3*9) (7*6) (6*1) (8*8) = 49 12 27 42 6 64 

Example Input/Output 2: 

Input: 
7 4 
10 20 30 40 
83 85 46 94 
14 78 84 14 
56 99 25 35 
12 85 27 25 
50 60 70 80 
54 36 55 51 
6 1 

Output: 
2000 1800 1400 800

Explanation: 
Here X = 6 and Y = 1. 
The sixth row of the matrix contains 50 60 70 80. 
The first row of the matrix contains 10 20 30 40. 
The product of the integers in the 6th row (left to right) and 1st row (right to left) is given below. 
(50*40) (60*30) (70*20) (80*10) = 2000 1800 1400 800

*/

import java.util.*;

public class RowColProd {

    public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            
            int row=sc.nextInt();
            int col=sc.nextInt();
            
            int[][] mat=new int[row][col];
            
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            
            sc.close();

            int[] arr1=new int[col];
            int[] arr2=new int[col];
            
            int ind1=0,ind2=0;
            
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i==r1-1){
                        arr1[ind1]=mat[i][j];
                        ind1++;
                    }
                    if(i==r2-1){
                        arr2[ind2]=mat[i][j];
                        ind2++;
                    }
                }
            }
            
            int j=col-1;
            
            for(int i=0;i<col;i++){
                System.out.print(arr1[i]*arr2[j]+" ");
                j--;
            }

    }    

}
