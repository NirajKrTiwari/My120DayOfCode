/*
Patter 1
---------
1. You are given the number n.
2. You've to create a pattern of * and separated it by tab as shown in the output format.

Input Format:

A number n
Output Format:
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*

Test Case:

Input:
5
Output:
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	

 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i, j, k;
        int n = scn.nextInt();
        for (i = 1; i <= n; i++) {
            for (k = 0; k < n - i; k++) {
                System.out.print("	");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*	");
            }
            System.out.println();
        }

    }
}