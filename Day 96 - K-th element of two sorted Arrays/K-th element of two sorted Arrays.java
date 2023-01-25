//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
public long kthElement( int arr1[], int arr2[], int n, int m, int k) {

        int length = arr1.length + arr2.length; 

        int[] mergedArray = new int[length];   

        int pos = 0;  

for (int element :arr1) 

{  

mergedArray[pos] = element;  

pos++;            

}  

for (int element : arr2) 

{  

mergedArray[pos] = element;  

pos++;  

} 

int r=0;

Arrays.sort(mergedArray);

for(int i=0;i<length;i++){

    if(i==k)

      r=mergedArray[i-1];

}

return r;

}
}
