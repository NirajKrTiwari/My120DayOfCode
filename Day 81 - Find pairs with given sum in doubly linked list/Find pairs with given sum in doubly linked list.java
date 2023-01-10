import java.io.*;
import java.util.*;

class Main {

	static class Node {
		int data;
		Node next, prev;
	};
	static void pairNode(Node head,int x)
	{
	    Node slow=head,fast=null;
	    if(head==null)
	    {
	        System.out.println("Empty");
	    }
	    else
	    {
	        int i=0;
	        while(slow.next!=null)
	        {
	            fast=slow.next;
	            while(fast!=null)
	            {
	                if(slow.data+fast.data==x)
	                {
	                    System.out.print("("+slow.data+","+fast.data+")");
	                    i=1;
	                }
	                fast=fast.next;
	            }
	            slow=slow.next;
	        }
	        if(i==0)
	             System.out.print("No pair found");
	    }
	}

	static Node insert(Node head, int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = temp.prev = null;
		if (head == null)
			(head) = temp;
		else {
			temp.next = head;
			(head).prev = temp;
			(head) = temp;
		}
		return temp;
	}

	public static void main(String args[])
	{
		Node head = null;
		head = insert(head, 9);
		head = insert(head, 8);
		head = insert(head, 6);
		head = insert(head, 5);
		head = insert(head, 4);
		head = insert(head, 2);
		head = insert(head, 1);
		int x = 7;
		pairNode(head,x);
	}
}
