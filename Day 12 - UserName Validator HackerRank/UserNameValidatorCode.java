
/*
Username Validator
HackerRank Question URL: https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true

Sample Input:
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output:
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

 */
import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}";
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}