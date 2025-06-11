/*Question 4/ 10
Description

Given an `n x n` matrix, rotate it by 90 degrees clockwise in-place (without using extra space).

 Input Format

 First line contains integer `n` (1 ≤ n ≤ 100), the size of the square matrix.

 Next `n` lines each contain `n` space-separated integers representing the matrix elements.

 Output Format

 Print the rotated matrix with elements separated by spaces and rows separated by newlines.


Constraints:
Matrix elements are integers with absolute value ≤ 10^9

1 ≤ n ≤ 100


Example:
Sample Input

3
1 2 3
4 5 6
7 8 9

Sample Output

7 4 1
8 5 2
9 6 3


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
1
42
42
2	
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
21 16 11 6 1 
22 17 12 7 2 
23 18 13 8 3 
24 19 14 9 4 
25 20 15 10 5
3	
1
1
1
4	
3
7 7 7
7 7 7
7 7 7
7 7 7 
7 7 7 
7 7 7 
5	
3
-1 -2 -3
-4 -5 -6
-7 -8 -9
-7 -4 -1 
-8 -5 -2 
-9 -6 -3 
6	
3
1 0 0
0 1 0
0 0 1
0 0 1 
0 1 0 
1 0 0 
7	
3
0 0 0
0 0 0
0 0 0
0 0 0 
0 0 0 
0 0 0
8	
2
1 2
3 4
3 1 
4 2 
9	
3
-1 -2 -3
-4 -5 -6
-7 -8 -9
-7 -4 -1 
-8 -5 -2 
-9 -6 -3
*/

// SOLUTION

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Read matrix
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        // Print rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
