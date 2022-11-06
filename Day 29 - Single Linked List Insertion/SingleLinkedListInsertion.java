/*
Singley Linked list Insertion Operation
Test Case1:
input:
	  s1.addBegNode(2);
        s1.addBegNode(3);
        s1.addBegNode(4);
        s1.addBegNode(6);
        s1.addBegNode(8);
        s1.addBegNode(11);
        s1.addBetweenNode(12, 2);
        s1.addLastNode(34);

output:
After Insetion:
8 6 4 3 2 
Inseting node at the beginning:
11 8 6 4 3 2 
Inseting node at the particular Location:
11 12 8 6 4 3 2 
Inseting node at the Last:
11 12 8 6 4 3 2 34
*/
package Day1;

public class SingleLinkedListInsertion {
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

    public void addBegNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void addLastNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addBetweenNode(int data, int position) {
        Node newNode = new Node(data);
        Node previous = head;
        int count = 1;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            newNode.next = current;
            previous.next = newNode;
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

    public static void main(String[] args) {
        SingleLinkedListInsertion s1 = new SingleLinkedListInsertion();
        s1.addBegNode(2);
        s1.addBegNode(3);
        s1.addBegNode(4);
        s1.addBegNode(6);
        s1.addBegNode(8);
        System.out.println("After Insetion:");
        s1.display();
        System.out.println();
        System.out.println("Inseting node at the beginning:");
        s1.addBegNode(11);
        s1.display();
        System.out.println();
        System.out.println("Inseting node at the particular Location:");
        s1.addBetweenNode(12, 2);
        s1.display();
        System.out.println();
        System.out.println("Inseting node at the Last:");
        s1.addLastNode(34);
        s1.display();
    }
}
