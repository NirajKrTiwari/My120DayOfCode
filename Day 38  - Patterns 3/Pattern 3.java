/*
Patter 3
---------
1. You are given the number n.
2. You've to create a pattern of * and separated it by space as shown in the output format.

Input Format:
A number n

Output Format:
    * 
   * * 
  * * * 
 * * * *

Test Case:

Input:
Enter the value of n:6
Output:
     
    * 
   * * 
  * * * 
 * * * * 
* * * * * 	

 */

import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=in.nextInt();
        int m=n;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                System.out.print(" ");
            }
            m=m-1;
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
