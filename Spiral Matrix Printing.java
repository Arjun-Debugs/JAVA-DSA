/*Question 5/ 10
Description

Given an `m x n` matrix, return all elements of the matrix in spiral order (clockwise, starting from the top-left corner).

Input Format

- First line contains two integers `m` and `n` (1 ≤ m, n ≤ 100), representing the number of rows and columns.

- Next `m` lines each contain `n` space-separated integers representing the matrix elements.

Output Format

- Print all elements in spiral order, separated by spaces.


Constraints:
Matrix elements are integers with absolute value ≤ 10^9

- 1 ≤ m, n ≤ 100


Example:
Sample Input

3 3

1 2 3
4 5 6
7 8 9

Sample Output

1 2 3 6 9 8 7 4 5

Solution
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Initialize boundaries
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        boolean first = true; // for spacing
        while (top <= bottom && left <= right) {
            // Traverse Left to Right
            for (int j = left; j <= right; j++) {
                if (!first) System.out.print(" ");
                System.out.print(matrix[top][j]);
                first = false;
            }
            top++;

            // Traverse Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(" " + matrix[i][right]);
            }
            right--;

            // Traverse Right to Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(" " + matrix[bottom][j]);
                }
                bottom--;
            }

            // Traverse Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(" " + matrix[i][left]);
                }
                left++;
            }
        }
    }
}
