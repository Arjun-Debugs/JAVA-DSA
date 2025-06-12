/*
Question 3/ 10
You are given a r x c matrix where every row and every column is sorted in ascending order. Your task is to determine whether a given number x exists in the matrix. Instead of scanning the entire matrix, you can use a smart search technique starting from the top-right or bottom-left corner. From there, you can eliminate a row or column in each step based on the comparison with x. This approach ensures an efficient search in O(r + c) time complexity. You must print "YES" if x is found and "NO" otherwise. This problem tests your ability to apply logical optimization techniques to matrix-based search problems.

Input Format:
First line: two integers r and c (number of rows and columns)
Next r lines: each contains c integers (sorted row-wise and column-wise)
Last line: an integer x to be searched

Output Format:
Print "YES" if x is found, otherwise print "NO"


Constraints:
1 ≤ r, c ≤ 1000
-10⁶ ≤ matrix[i][j], x ≤ 10⁶
Each row and each column is sorted in non-decreasing order


Example:
Sample Input:
3 3
1 4 7
2 5 8
3 6 9
5
 
Sample Output:
YES
*/

// Solution
import java.util.*;
class Main {
  public static boolean searchMatrix(int[][] matrix, int r, int c, int target) {
    int row = 0;
    int col = c - 1;
    while (row < r && col >= 0) {
      int current = matrix[row][col];
      if (current == target) return true;
      else if (current > target) col--;
      else row++;
    }
    return false;
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int matrix[][] = new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        matrix[i][j] = s.nextInt();
      }
    }
    int x = s.nextInt();
    if (searchMatrix(matrix, r, c, x)) System.out.println("YES");
    else System.out.println("NO");
  }
}
