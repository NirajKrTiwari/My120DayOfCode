/*
Patter 7
---------
1. You are given the number n.
2. You've to create a pattern of * and separated it by space as shown in the output format.

Input Format:
A number n

Output Format:

				*	
			*		
		*			
	*				
*	

Test Case:

Input:
Enter the value of n: 5
Output:

				*	
			*		
		*			
	*				
*		

 */

Code:

import java.util.*;
public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int st = 1;
    int sp = n - 1;
    for (int i = 1; i <= n; i++)
    {
      for (int j = sp; j > 0; j--)
      {
        System.out.print("\t");
      }
      sp -= 1;
      for (int j = 0; j < 1; j++)
      {
        System.out.print("*\t");
      }
      System.out.println();
    }

  }
}