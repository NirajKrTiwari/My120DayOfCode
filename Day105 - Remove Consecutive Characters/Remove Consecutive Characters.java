//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        Stack<Character> list= new Stack<>();
    for(char c:S.toCharArray())
    {
        if(!list.isEmpty() && list.peek()==c)
        {
            
        }
        else
        {
            list.push(c);
        }
    }
    String n = "";
        while(!list.isEmpty()){
            n =list.pop()+ n ;
        }
    return n;
    }
}SS