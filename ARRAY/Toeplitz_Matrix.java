/*Question 3/ 10
Description

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements. Given an m x n matrix, determine if it is Toeplitz.

Input Format

First line contains two integers m and n (1 ≤ m, n ≤ 1000), representing the number of rows and columns.
Next m lines each contain n space-separated integers representing the matrix elements.
Output Format

Print "true" if the matrix is Toeplitz, otherwise print "false".

Constraints:
Matrix elements are integers with absolute value ≤ 10^9
1 ≤ m, n ≤ 1000

Example:
Sample Input
3 4

1 2 3 4
5 1 2 3
9 5 1 2

Sample output
true


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
3 3
1 2 3
4 1 2
5 4 1
true
2	
1 5
1 2 3 4 5
true
3	
4 1
1
2
3
4
true
4	
3 4
1 2 3 4
5 1 2 3
9 5 1 2
true
5	
3 3
7 7 7
7 7 7
7 7 7
true
6	
4 5
1 2 3 4 5
6 1 2 3 4
7 6 1 2 3
8 7 6 1 2
true
7	
1 4
1 2 3 4
true
8	
2 2
1 2
2 1
true
9
*/


//Solution

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            arr[i][j] = s.nextInt();
          }
        }
        for(int i=0;i<m-1;i++){
          for(int j=0;j<n-1;j++){
            if(arr[i][j]!=arr[i+1][j+1]){
              System.out.print("false");
              return;
            }
          }
        }
        System.out.print("true");
    }
}
