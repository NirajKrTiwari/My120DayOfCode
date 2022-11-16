/*
Patter 8
---------
1. You are given the number n.
2. You've to create a pattern of * and separated it by space as shown in the output format.

Input Format:
A number n

Output Format:

*				*	
	*		*		
		*			
	*		*		
*				*

Test Case:

Input:
Enter the value of n: 5
Output:

*				*	
	*		*		
		*			
	*		*		
*				*	

 */

Code:

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if((i==j) || (i+j==n+1))
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }
        }
         System.out.println();
    }

    }
}