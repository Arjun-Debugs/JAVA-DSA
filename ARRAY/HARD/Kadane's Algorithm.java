/*
Question 1/ 10
You are given an array of integers. Your task is to find the maximum sum of any contiguous subarray using Kadane’s Algorithm. This problem focuses on efficient handling of large arrays and is a classic in dynamic programming. A contiguous subarray is a part of the array formed by consecutive elements. Kadane's Algorithm efficiently finds the maximum sum by keeping track of the current subarray sum and updating the global maximum when a better sum is found. The algorithm runs in linear time and works even if the array contains all negative numbers. Print the maximum subarray sum at the end. This is useful in many real-world applications such as financial analysis and signal processing.

Input Format:
The first line contains an integer n — size of the array.
The next line contains n space-separated integers.

Output Format:
Print a single integer — the maximum subarray sum.

Constraints:
1 ≤ n ≤ 10⁵
-10⁶ ≤ array[i] ≤ 10⁶


Example:
Sample Input:
9
-2 1 -3 4 -1 2 1 -5 4

Sample Output:
6
*/

// SOLUTION

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++) arr[i] = s.nextInt();
    int maxSum = arr[0], currSum = arr[0];
    for(int i=1;i<n;i++){
      currSum = Math.max(arr[i],arr[i]+currSum);
      maxSum = Math.max(currSum,maxSum);
    }
    System.out.print(maxSum);
  }
}
