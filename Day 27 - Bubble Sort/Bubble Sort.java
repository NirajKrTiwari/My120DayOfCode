/*
Bubble Sort
------------
Test Case 1:
Input:
Enter number of element you want to enter:5
Enter elements
1
5
3
7
8

Ouput:
Before
1 5 3 7 8 
After
1 3 5 7 8 
*/

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of element you want to enter:");
        int n = in.nextInt();
        int A[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Before");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        BubbleSort(A);
        System.out.println("\nAfter");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
    public static void BubbleSort(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=A.length-1;j>=i+1;j--)
            {
                if(A[j]<A[j-1])
                {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
    }
}