/*
Roman Number to Integer
------------------------

Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Test Case 1:

Input:
s = V
Output: 5

Te 2:

Input:
s = III 
Output: 3

 */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}

class Solution{
public int romanToDecimal(String str)
{
HashMap<Character,Integer>map = new HashMap<>();

        map.put('I',1);

        map.put('X',10);

        map.put('V',5);

        map.put('L',50);

        map.put('C',100);

        map.put('D', 500);

        map.put('M',1000);

       int result=map.get(str.charAt(str.length()-1));

       for(int i=str.length()-2;i>=0;i--){

           if(map.get(str.charAt(i))<map.get(str.charAt(i+1))){

               result-=map.get(str.charAt(i));

           }else{

               result+=map.get(str.charAt(i));

           }

       }

       return result;
}
    
}
