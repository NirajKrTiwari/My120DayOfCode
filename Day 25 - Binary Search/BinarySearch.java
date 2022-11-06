/*
Binary Search
--------------
Test Case 1:
Input:
Enter number of element you want to enter:4
Enter elements
12
23
56
78
Enter Number You want to Search: 23

Output:
23 is found at index: 1

Test Case2:
Input:
Enter number of element you want to enter:4
Enter elements
2
3
2
5
Enter Number You want to Search: 0

Output:
0 is found at index: -1
*/
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of element you want to enter:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.print("Enter Number You want to Search: ");
        int target = in.nextInt();
        System.out.println(target + " is found at index: " + binarySearch(a, target));
    }
    public static int binarySearch(int[] a, int target) {
        int lo=0,mid=0;
        int hi=a.length-1;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]<target)
            {
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
        }
        return -1;
    }
}