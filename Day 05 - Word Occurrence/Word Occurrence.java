/*
Write a program that will read a line and count all occurrences of the word given by the user.

Test Case 1:
Lower and Upper case input from user
Example: 
String="The life is a beautiful gift from god"
Word to count the number of occurrence: the
Output: Total "the" in the sentence:0
Problem:
If a user input "the" and "t" is in a lower case so it will not count "the" because "the" in the above string is in upper case.
Solution:
We can make whole sentence and word to count in either in lower or upper case and then we can count the number of occurrence.


Example1
Input:
Enter Sentence: The life is a beautiful gift from god
Enter the word you want to count the occurrence: life
Output:
Total "life" in the sentence: 1

Example 2
Input:
Enter Sentence: The life is a beautiful gift from god
Enter the word you want to count the occurrence: not
Output:
Total "not" in the sentence: 0

Time complexity: O(n)

*/

import java.util.Scanner;
public class StringOccurrence {
    public static Scanner n = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Sentence: ");
        String str = n.nextLine();
        System.out.print("Enter the word you want to count the occurrence: ");
        String str1 = n.nextLine();
        int counter=0;

        String  a[] = str.toLowerCase().split(" ");
        for(int i = 0;i<a.length;i++)
        {
            String s=a[i].intern();
            if(str1.toLowerCase().intern() ==s)
            {
                counter++;
            }

        }
        System.out.println("Total \""+str1+"\" in the sentence: "+counter);

    }
}
