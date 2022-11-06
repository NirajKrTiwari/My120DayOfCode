
/*
String Sorting

Test Case 1:
Any Number Input by the user
Example: 
String="123"

Solution:
It can be handle by using Exception handling

Example 1

Input:
Enter number of name you want to enter: 3
Enter the names:
Dog 
Blue
Apple

Output:
After Sorting:
Apple
Blue
Dog

Example 2

Input:
Enter the names:
X
Y
O
P

Output:
After Sorting:
O
P
X
Y

Time complexity: O(n^2)

 */

import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of name you want to enter: ");
        int m = in.nextInt();
        String str[] = new String[m];
        System.out.println("Enter the names: ");

        for (int j = 0; j < m; j++) {
            str[j] = in.next();
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                String s = str[i];
                if (isNumeric(s)) {
                    return;
                }
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting:");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
