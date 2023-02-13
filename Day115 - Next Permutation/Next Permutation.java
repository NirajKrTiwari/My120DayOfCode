//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
 static List<Integer> nextPermutation(int N, int arr[]){

        List<Integer>list=new ArrayList<>();

        int currentIndex=-1;

   for(int i=arr.length-1;i>0;i--){

    if(arr[i]>arr[i-1]){

        currentIndex=i;break;} }

   if(currentIndex==-1){

       for(int i=arr.length-1;i>=0;i--){

           list.add(arr[i]);}}

   else{

    int previous=currentIndex;

    for (int i = currentIndex+1; i < arr.length; i++) {

        if(arr[i]>arr[currentIndex-1]&&arr[i]<arr[previous]){

            previous=i;

        }

    }

     int temp=arr[ currentIndex-1];

       arr[ currentIndex-1]=arr[previous];

       arr[previous]=temp;

    int i=currentIndex;

    int j=arr.length-1;

    while(i<=j){

         temp=arr[i];

       arr[i]=arr[j];

       arr[j]=temp;

        i++;

        j--;

    }

    for(int ii=0;ii<arr.length;ii++){

        list.add(arr[ii]);

    }}

    return list;

    }
}