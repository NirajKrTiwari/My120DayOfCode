/*
Move all the negative elements to one side of the array
--------------------------------------------------------
Test Case1:
Input:
Enter the number of elements you want to enter:
4
Enter the elements:
7
5
-8
-9
Output:
After Moving:
-8 -9 7 5

Test Case2: //All negative number
Input:
Enter the number of elements you want to enter:
5
Enter the elements:
-3
-9
-1
-4
-5

Output:
After moving:
-3 -9 -1 -4 -5

*/
import java.util.Scanner;
    class  Positive_and_Negative{
        static void rearrange(int arr[], int n)
        {
            int j = 0, temp;
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    if (i != j) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j++;
                }
            }
        }
        static void printArray(int arr[], int n)
        {
            System.out.println("After moving:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
        public static void main(String args[])
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the number of elements you want to enter: ");
            int n=in.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            rearrange(arr, n);
            printArray(arr, n);
        }
    }
