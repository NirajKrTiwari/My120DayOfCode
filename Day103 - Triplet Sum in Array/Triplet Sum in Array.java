import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        int i,j,k;
        int n1=A.length;
       for(i=0;i<n1-2;i++)
       {
           j=i+1;
           k=n1-1;
           int sum=0;
           while(k>j)
           {
               if(i!=j && i!=k && j!=k)
               {
                sum=A[i]+A[j]+A[k];
               if(sum==X)
               {
                   return true;
               }
               }
               if(sum<X)
                    j++;
                if(sum>X)
                {
                    k--;
                }

           }
       } 
       return false;
    }
}
