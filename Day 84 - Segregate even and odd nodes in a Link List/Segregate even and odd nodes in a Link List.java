//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        Node head1=null;
        Node temp1=null;
        Node head2=null;
        Node temp2=null;
        Node temp=head;
        
        while(temp!=null)
        {
            if(temp==null)
            {
                return head;
            }
            if(temp.data%2==0)
            {
                if(head1==null)
                {
                    head1=temp;
                    temp1=head1;
                }
                else
                {  
                    temp1.next=temp;
                    temp1=temp;
                }
            }
            else
            {
                if(head2==null)
                {
                    head2=temp;
                    temp2=head2;
                }
                else
                {
                temp2.next=temp;
                temp2=temp;
                }
            }
            temp=temp.next;
        }
        if(head1!=null && head2!=null)
        {
        temp1.next=head2;
        temp2.next=null;
        return head1;
        }
        else if(head1==null)
        {
            temp2.next=null;
            return head2;
        }
        else
        {
            temp1.next=null;
            return head1;
        }
        
    }
}