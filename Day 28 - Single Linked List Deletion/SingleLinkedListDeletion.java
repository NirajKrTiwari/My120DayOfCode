/*

Singly Linked List Deletion Operation
Test Case 1:
Input:
 	  s1.addNode(1);
        s1.addNode(4);
        s1.addNode(3);
        s1.addNode(2);
        s1.addNode(5);
        s1.display();
        s1.delNodeBeg();
        s1.display();
        s1.delNodeEnd();
        s1.display();
        s1.delNodeBtw(2);
        s1.display();
Output:
After Insertion:
1 4 3 2 5 
Deletion of Node at the Beginning
4 3 2 5 
Deletion of Node at the End
4 3 2 
Deletion of Node at particular Location
4 2 

Test Case 2:
Input:
s1.delNodeBtw(2); //Linked List is Empty
Output:
Empty
*/

public class SingleLinkedListDeletion {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public void delNodeBeg() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head != tail)
            head = head.next;
        else
            head = tail = null;
    }

    public void delNodeEnd() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node current = head;

        if (head != tail) {
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        } else
            head = tail = null;
    }

    public void delNodeBtw(int index) {
        Node current = head;
        Node temp = null;
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head != tail) {
            for (int i = 0; i < index - 1; i++) {
                temp = current;
                current = current.next;
            }
            temp.next = current.next;

        } else {
            head = tail = null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedListDeletion s1 = new SingleLinkedListDeletion();
        s1.addNode(1);
        s1.addNode(4);
        s1.addNode(3);
        s1.addNode(2);
        s1.addNode(5);
        System.out.println("After Insertion:");
        s1.display();
        System.out.println();
        System.out.println("Deletion of Node at the Beginning");
        s1.delNodeBeg();
        s1.display();
        System.out.println();
        System.out.println("Deletion of Node at the End");
        s1.delNodeEnd();
        s1.display();
        System.out.println();
        System.out.println("Deletion of Node at particular Location");
        s1.delNodeBtw(2);
        s1.display();
    }
}
