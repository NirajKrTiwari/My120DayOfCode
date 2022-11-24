/*
LinkedList implementation of Queue
----------------------------------

Test Case 1:

Inserting 1
Inserting 2
Inserting 3
Inserting 4
The front element is 1
Removing 1
Removing 2
Removing 3
Removing 4
The queue is empty

Test Case2:

dequeue();
Queue Underflow

*/

Code:

class Node
{
    int data;
    Node next; 
 
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
class Queue
{
    private static Node rear = null, front = null;
    private static int count = 0;
    public static int dequeue()
    {
        if (front == null)
        {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }
 
        Node temp = front;
        System.out.printf("Removing %d\n", temp.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count -= 1;
        return temp.data;
    }
    public static void enqueue(int item)
    {
        Node node = new Node(item);
        System.out.printf("Inserting %d\n", item);
        if (front == null)
        {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
        count += 1;
    }
    public static int peek()
    {
        if (front == null) {
            System.exit(-1);
        }
 
        return front.data;
    }
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
    private static int size() {
        return count;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
 
        System.out.printf("The front element is %d\n", q.peek());
 
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
 
        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}