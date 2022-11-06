
/*

Replace Special Character using Regular Expression
--------------------------------------------------
Given a string 's' , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

HackerRank Question URL: https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

---------------------------------------------------------------------------------------------------------------------
Test Case1:

Sample Input:
He is a very very good boy, isn't he?

Sample Output:
10
He
is
a
very
very
good
boy
isn
t
he

Test Case2:
space as the input
solution:
 if(!s.trim().isEmpty()) // to remove the extra space from front and end. if empty move to else part.
Sample Input:
 
Sample Output: 
0

 */
import java.io.*;
import java.util.*;

public class JavaStringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (!s.trim().isEmpty()) {
            String[] str = s.trim().split("[ !,?._'@]+");
            System.out.println(str.length);
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        } else
            System.out.println("0");
        scan.close();
    }
}
