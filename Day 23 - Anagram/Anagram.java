/*
Anagram
--------
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string a.
The second line contains a string b.

Test Case1:
Input:
anagram
margana
Output:
Anagrams

Test Case2:
Input:
Hello
hello
Output:
Anagrams

Test Case3:
Input:
anagramm
marganaa
Output:
Anagrams

Hacker Rank Question: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
 */
import java.util.Scanner;
import static java.util.Arrays.*;
public class Anagram {

        static boolean isAnagram(String a, String b) {
            char[] x=a.toUpperCase().toCharArray();
            char[] y=b.toUpperCase().toCharArray();
            sort(x);
            sort(y);
            if(a.length()!=b.length())
                return false;
            for(int i=0;i<a.length();i++){
                if(x[i]==y[i]){
                    continue;
                }else{
                    return false;

                }

            }
            return true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }
