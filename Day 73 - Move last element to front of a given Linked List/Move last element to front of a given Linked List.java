import java.util.*;
class StartingPointLoop {
    static Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.next = null;
        return temp;
    }
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void display(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.key+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static Node switch1(Node head)
    {
        Node prev=null;
        Node current=head;
	  if(head.next==null)
        	{
            	return head;
        	}
        while(current.next!=null)
        {
            prev=current;
            current=current.next;
        }
        prev.next=null;
        current.next=head;
        head=current;
        return head;
    }
    public static void main(String[] args) {
        Node head = newNode(50);
        head.next = newNode(20);
        head.next.next = newNode(15);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(10);
        System.out.println("Linked list before moving last to front");
        display(head);
        Node head1=switch1(head);
        System.out.println("Linked list after moving last to front");
        display(head1);
    }

    static class Node {
        int key;
        Node next;
    }
}
