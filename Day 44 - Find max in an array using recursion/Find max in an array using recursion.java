/*
Find max in an array using recursion
--------------------------------------
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. 
4. For the purpose complete the body of maxOfArray function. Don't change the signature.

Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max

Test Case:
Input:
6
15
30
40
4
11
9

Output:
40	

 */

Code:

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++)
    {
      a[i] = in.nextInt();
    }
    System.out.println(maxOfArray(a, 0));
  }

  public static int maxOfArray(int[] arr, int idx) {
    if (idx == arr.length - 1)
    {
      return arr[idx];
    }
    int max = maxOfArray(arr, idx + 1);
    if (max > arr[idx])
      return max;
    else
      return arr[idx];
  }

}