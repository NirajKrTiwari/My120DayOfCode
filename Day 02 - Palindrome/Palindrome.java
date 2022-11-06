
<<<<<<< HEAD
/*
 Given a string S, check if it is palindrome or not.
=======
import java.util.Scanner;
public class PalindromeGeek {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter any String: ");
            String S=in.nextLine();
            String s1 = "";
            for (int i = S.length() - 1; i >= 0; i--) {
                s1 = s1 + S.charAt(i);
            }
            if (S.equals(s1)) {
                System.out.println("S is Palindrome");
            } else {
                System.out.println("S is not Palindrome");
            }
>>>>>>> 63b31e9eff454aacda4f0924f7ccc14c27dab1a5

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)

 */
import java.util.Scanner;

public class PalindromeGeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String S = in.nextLine();
        String s1 = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            s1 = s1 + S.charAt(i);
        }
        if (S.equals(s1)) {
            System.out.println("S is Palindrome");
        } else {
            System.out.println("S is not Palindrome");
        }

    }
<<<<<<< HEAD
}
=======
>>>>>>> 63b31e9eff454aacda4f0924f7ccc14c27dab1a5
