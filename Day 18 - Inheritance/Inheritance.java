/*
Inheritance in Java
--------------------
Write the following code in your editor below:

1. A class named Arithmetic with a method named add that takes two integers as parameters and returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.

HackerRank Question URL: https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
-------------------------------------------------------------------------------------------------------------------------------------------------------------
Test Case1:
Multiple Inheritance is not possible in java using extends keywords.

solution:
It is possible by using interface in java.

Sample Input:
System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");

Sample Output: 
My superclass is: Arithmetic
42 13 20

-------------------------------------------------------------------------------------------------------------------------------------------------------------

 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}
// Write your code here

public class Solution {
    public static void main(String[] args) {
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3
        // space-separated integers:
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
