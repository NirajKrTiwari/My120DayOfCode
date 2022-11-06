import java.util.Scanner;

/*
Array Sorting by using bubble sort

Test Case 1:
Duplicate input by the user
Input: 2 1 1 4
Output: 1 1 2 4


Input:
Enter number of element you want to enter:3
Enter elements
52
42
21
1
343
5

Output:
Before:
52 43 21 1 343 5
After
1 5 21 43 52 343


 */
public class ArraySorting {
    public static void main(String[] args) {
        int temp=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of element you want to enter:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Before:");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr.length-1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
