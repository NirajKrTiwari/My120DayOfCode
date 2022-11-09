/*
Count pairs with the given sum in the array
--------------------------------------------

Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
Test Case 1:
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Test Case 2:
Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

Test Case 3:
Input:
N = 1, K = 2
arr[] = {1}
Output: 0

Test Case 3:
Input:
N = 0, K = 2
arr[] = {}
Output: 0


 */

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count=0;
        if(n!=1 || n!=0)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        return count;
        }
        return 0;
    }
}

