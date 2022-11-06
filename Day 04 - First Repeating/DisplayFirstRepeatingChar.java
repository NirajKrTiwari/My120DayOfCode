/*
Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

Example 1:

Input: S = "geeksforgeeks" Output: g Explanation: g, e, k and s are the repeating characters. Out of these, g occurs first. Example 2:

Input: S = "abcde" Output: -1 Explanation: No repeating character present.

Expected Time Complexity: O(n). Expected Auxiliary Space: O(1).
*/public class DisplayFirstRepeatingChar {

        static char firstRep(String S)
        {
            for(int i=0;i<S.length();i++)
            {
                for(int j=i+1;j<S.length();j++)
                {
                    if(S.charAt(i)==S.charAt(j))
                    {
                        return S.charAt(i);
                    }
                }
            }
            return '#';
        }

    public static void main(String[] args) {
        String S="geeksofgeeks";

        System.out.println(firstRep(S));
    }

}
