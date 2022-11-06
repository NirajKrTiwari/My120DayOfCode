/*
Singly Linked List Search Operation
------------------------------------
Test Case1:
Input:
LinkedList
8 6 4 3 2 
Enter element you want to search: 2
Output:
Element is present at the index 5

Test Case2:
Input:
LinkedList
8 6 4 3 2 
Enter element you want to search: 1
Output:
Error: Element is not present in the list

*/
package Day3;

import java.util.Scanner;

public class SinglyLinkedListSearchOpr {

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

    public void searchNode(int target) {
        Node current = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        int i = 1;
        while (current != null) {
            if (current.data == target) {
                System.out.println("Element is present at the index " + i);
                return;
            } else {
                current = current.next;
                i++;
            }
        }
        System.out.println("Error: Element is not present in the list");

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
        SinglyLinkedListSearchOpr s1 = new SinglyLinkedListSearchOpr();
        s1.addBegNode(2);
        s1.addBegNode(3);
        s1.addBegNode(4);
        s1.addBegNode(6);
        s1.addBegNode(8);
        System.out.println("LinkedList");
        s1.display();
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter element you want to search: ");
        int target = in.nextInt();
        System.out.println();
        s1.searchNode(target);
        in.close();

    }
}
