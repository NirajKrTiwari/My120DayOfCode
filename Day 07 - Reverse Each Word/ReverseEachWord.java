/*
Reverse Each Word

Test Case 1:
Extra spaces in between the sentence.
Example:
Input: Enter the sentence: The Wold   is best
Output: Reverse Word:ehT dloW   si tseb
Solution:by using replaceAll("( )+", " ") we can replace extra spaces in between

Example 1
Input:
Enter the sentence: Hello World
Output:
Reverse Word: olleH dlroW

Example 2
Input:
Enter the sentence: Welcome to VIT
Output:
Reverse Word:emocleW ot TIV

Time complexity: O(n^2)

 */
import java.util.Scanner;
    public class ReverseEachWord {
        public static void main(String[] args) {
            String str ;
            System.out.print("Enter the sentence: ");
            Scanner in = new Scanner(System.in);
            str = in.nextLine();
            String reverse = "";
            String string[] = str.split(" ");
            for(int i = 0;i<string.length;i++)
            {
                String string2 = string[i];
                String word = "";
                for(int j = string2.length()-1; j>=0;j--)
                {
                    word = word+string2.charAt(j);
                }
                if(i<string.length-1)
                    reverse = reverse+ word + " ";
                else
                    reverse = reverse+ word;
            }
            System.out.println("Reverse Word:"+reverse);
        }
    }
