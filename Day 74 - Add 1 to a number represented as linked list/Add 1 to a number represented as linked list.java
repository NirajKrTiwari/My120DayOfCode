//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


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

class Solution
{
    public static Node reverse(Node head)
    {
        if(head==null || head.next==null)
            return head;
        Node cur=head;
        Node next=null;
        Node prev=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
        
    }
    public static Node addOne(Node head) 
    { 
        head=reverse(head);
        Node cur=head;
        Boolean f=true;
        while(cur!=null && f==true)
        {
            if(cur.data==9 && cur.next==null)
            {
                Node temp=new Node(0);
                cur.data=1;
                temp.next=head;
                head=temp;
                cur=cur.next;
            }
            else if(cur.data==9)
            {
                cur.data=0;
                cur=cur.next;
            }
            else
            {
                cur.data=cur.data+1;
                cur=cur.next;
                f=false;
            }
            
        }
        head=reverse(head);
        return head;
    }
}
