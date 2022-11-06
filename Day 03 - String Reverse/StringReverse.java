/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.


Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]


Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 
 */
public class StringReverse {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        int j = 0, k = s.length - 1;
        for (int i = (s.length / 2) - 1; i >= 0; i--) {
            char temp = s[k];
            s[k] = s[j];
            s[j] = temp;
            j++;
            k--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
