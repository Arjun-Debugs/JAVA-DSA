/*
Q6

Given a 2D matrix, print its elements in a wave-like pattern. The wave pattern starts from the top-left corner of the matrix and moves down the first column, then up the second column, then down the third column, and so on.

Input Format

- First line contains two integers `rows` and `cols` representing the dimensions of the matrix

- Next `rows` lines each contain `cols` integers representing the matrix elements

Output Format

- A single line containing the matrix elements printed in wave order, separated by spaces


Constraints:
1 ≤ rows, cols ≤ 100
 -1000 ≤ matrix[i][j] ≤ 1000


Example:
Sample Input

3 4

1 2 3 4

5 6 7 8

9 10 11 12

Sample Output

1 5 9 10 6 2 3 7 11 12 8 4
*/

//Solution
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
        
        int left = 0, right = n - 1;
        boolean first = true;
        while (left <= right) {
            for (int i = 0; i <= m-1; i++) {
                System.out.print(" " + matrix[i][left]);
            }
            left++;
            if(left<=right){
            for (int i = m-1; i >= 0; i--) {
                System.out.print(" " + matrix[i][left]);
            }
            left++;
            }
        }
    }
}
