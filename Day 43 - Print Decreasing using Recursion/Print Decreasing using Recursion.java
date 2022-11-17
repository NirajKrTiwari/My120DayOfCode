/*
Print Decreasing using Recursion
---------------------------------
1. You are given a positive number n. 
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

Input Format:
A number n

Output Format:

n
n - 1
n - 2
.. 
1

Test Case:

Input:
Enter the value of n: 5
Output:
5
4
3
2
1	

 */

Code:

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    printDecreasing(n);
  }

  public static void printDecreasing(int n) {
    if (n >= 1)
    {
      System.out.println(n);
      n = n - 1;
      printDecreasing(n);
    }
  }

}