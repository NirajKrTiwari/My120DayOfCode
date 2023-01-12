import java.util.Scanner;

public class RotateDoubly {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNodeAfter(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head.prev = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Empty");
        } else {

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void rotate(int n) {
        Node temp = head;
        Node temp1 = null;
        Node h1 = head;
        int i = 0;
        try {
            while (i < n) {
                temp1 = temp;
                temp = temp.next;
                i++;
            }
            head = temp;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = h1;
            h1.prev = temp;
            temp1.next = null;
            head.prev = null;
            System.out.println("Rotated linked list ");
            display();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter n:");
            int n = in.nextInt();
            RotateDoubly s1 = new RotateDoubly();
            s1.addNodeAfter(1);
            s1.addNodeAfter(2);
            s1.addNodeAfter(3);
            s1.addNodeAfter(4);
            s1.addNodeAfter(10);
            System.out.println("Given linked list ");
            s1.display();
            s1.rotate(n);
        }

    }

}