/*
Patter 5
---------
1. You are given the number n.
2. You've to create a pattern of * and separated it by space as shown in the output format.

Input Format:
A number n

Output Format:
	 	*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	

Test Case:

Input:
Enter the value of n: 5
Output:
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*		

 */
Code:

import java.util.*;
public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = scn.nextInt();
    int st = 1;
    int sp = n / 2;
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= sp; j++)
      {
        System.out.print("\t");
      }
      for (int j = 1; j <= st; j++)
      {
        System.out.print("*\t");
      }
      if (i <= n / 2)
      {
        st = st + 2;
        sp = sp - 1;

      }
      else {
        st = st - 2;
        sp = sp + 1;
      }
      System.out.println();
    }
  }
}