/*Question 2/ 10
Description

Given an array of integers, rotate the array to the left by `D` positions. The rotation should be done in-place with O(1) space complexity (excluding the input array itself).

Input Format

 First line contains two integers `n` (1 ≤ n ≤ 10^5) and `D` (0 ≤ D ≤ 10^5), where `n` is the size of the array and `D` is the number of positions to rotate left.

 Second line contains `n` space-separated integers representing the array elements.

Output Format

 Print the rotated array with elements separated by spaces.


Constraints:
1 ≤ n ≤ 10^5

0 ≤ D ≤ 10^5

Array elements are integers with absolute value ≤ 10^9


Example:
Sample Input

5 2

1 2 3 4 5

Sample Output

3 4 5 1 2


Explanation:
NA


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
1	
7 0
3 1 4 1 5 9 2
3 1 4 1 5 9 2
2	
5 7
1 2 3 4 5
3 4 5 1 2
3	
1 5
42
42
4	
3 0
1 2 3
1 2 3
5	
5 2
1 2 3 4 5
3 4 5 1 2
6	
6 1
11 12 13 14 15 16
12 13 14 15 16 11
7	
5 3
0 0 0 0 0
0 0 0 0 0
8	
6 3
10 20 30 40 50 60
40 50 60 10 20 30
9	
4 4
1 2 3 4
1 2 3 4
*/

//SOLUTION

import java.util.*;

public class Main {
    // Function to reverse a subarray
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to left rotate the array by D positions
    static void leftRotate(int[] arr, int D, int n) {
        D = D % n; // To handle D > n

        // Step 1: Reverse first D elements
        reverse(arr, 0, D - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, D, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n and D
        int n = sc.nextInt();
        int D = sc.nextInt();

        // Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Perform rotation
        leftRotate(arr, D, n);

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }

        sc.close();
    }
}
