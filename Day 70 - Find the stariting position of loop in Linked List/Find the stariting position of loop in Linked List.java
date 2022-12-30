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
    static Node LoopPosition(Node head) {
        Node slow=head;
        Node fast=head;
        if(head==null)
            return null;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                slow=head;
                break;
            }
        }
        while(slow.next!=null)
        {
            if(slow==fast)
                return slow;
            slow=slow.next;
            fast=fast.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Node head = newNode(50);
        head.next = newNode(20);
        head.next.next = newNode(15);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(10);
        //head.next.next.next.next.next = head.next.next;
        try {
            Node res = LoopPosition(head);
            if (res == null)
                System.out.print("Loop does not exist");
            else
                System.out.print("Loop starting node is " + res.key);
        }
        catch (Exception e)
        {
            System.out.println("No loop available");
        }
    }

    static class Node {
        int key;
        Node next;
    }
}
