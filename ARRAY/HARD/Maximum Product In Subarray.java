/*
Question 2/ 10
You are given an array of integers. Your task is to find the maximum product of any contiguous subarray within it. This problem is a variation of Kadane’s Algorithm and requires tracking not only the current maximum product but also the current minimum, because a negative number could turn the minimum product into the maximum. The solution must account for positive, negative, and zero values. This algorithm is useful in financial analysis, competitive programming, and dynamic programming challenges. The goal is to print the largest product possible using any subarray (of at least one element). The challenge lies in handling the sign changes and zero resets correctly to maintain accuracy and efficiency.

Input Format:
The first line contains an integer n — the number of elements in the array.
The next line contains n space-separated integers.

Output Format:
Print a single integer — the maximum product of any contiguous subarray.


Constraints:
1 ≤ n ≤ 10⁵
-10⁶ ≤ array[i] ≤ 10⁶


Example:
Sample Input:
5
2 3 -2 4 -1

Sample Output:
48
*/

// Solution

import java.util.*;
class Main {
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    static int maxProduct(int[] arr) {
        int n = arr.length;
        int currMax = arr[0];
        int currMin = arr[0];
        int maxProd = arr[0];
        for (int i = 1; i < n; i++) {
            int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);
            currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);
            currMax = temp;
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = s.nextInt();
        System.out.print(maxProduct(arr));
    }
}
