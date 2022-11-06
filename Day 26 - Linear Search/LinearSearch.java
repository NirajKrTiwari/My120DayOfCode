/*
Linear Search
--------------
Test Case 1:
Input:
Enter number of element you want to enter:5
Enter elements
2
4
5
2
6
Enter Number You want to Search: 2

Output:
true

Test Case 2:
Input:
Enter number of element you want to enter:5
Enter elements
2
4
5
2
6
Enter Number You want to Search: 0

Output:
false
*/
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of element you want to enter:");
        int n=in.nextInt();
        int A[]=new int[n+1];
        System.out.println("Enter elements");
        for(int i=1;i<A.length;i++)
        {
            A[i]=in.nextInt();
        }
        System.out.print("Enter Number You want to Search: ");
        int key=in.nextInt();
        System.out.println(linearSearch(A,key));
    }
    public static boolean linearSearch(int[]A, int key) {
        int i=1;
        int n=A.length-1;
        while(i<=n && A[i]!=key)
        {
            i++;
        }
        if (i<=n) {
            return true;
        }
        else {
            return false;
        }
    }
}
