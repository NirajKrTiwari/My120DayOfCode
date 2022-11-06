
/*

Primality Test at most 100 digits
-----------------------------

HackerRank Question URL: https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true

---------------------------------------------------------------------------------------------------------------------
Test Case1:

Sample Input:
13

Sample Output:
prime

Test Case2:
Integer support upto 2,147,483,647. So, not possible to find prime number at most 100 digit.
solution:
BigInteger

Sample Input:
9547848065153773335707495885453566120069130270246768806790708393909999
Sample Output: 
prime

 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger y = new BigInteger(n);
        if (y.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
