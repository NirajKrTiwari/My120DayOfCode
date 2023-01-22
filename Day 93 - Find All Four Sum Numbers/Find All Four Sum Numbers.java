//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int req = k - arr[i] - arr[j];
                int start = j+1;
                int end = n-1;
                while(start < end){
                    ArrayList<Integer> al = new ArrayList<>();
                    if(arr[start] + arr[end] == req){
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[start]);
                        al.add(arr[end]);
                        if(!ans.contains(al)){
                            ans.add(al);
                        }
                        start++;
                        end--;
                    }    
                    else if(arr[start] + arr[end] < req){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        
        return ans;
        
    }
}

