import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 



class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n)
	{ 
	    long P[]=new long[n];
	    long m;
        for(int i=0;i<n;i++)
        {
            m=1;
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                    m=m*nums[j];
            }
            P[i]=m;
        }
        return P;
	} 
} 
