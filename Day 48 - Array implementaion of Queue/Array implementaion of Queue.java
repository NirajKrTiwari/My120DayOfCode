/*
Array implementation of Queue
------------------------------

Test Case 1:

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:1
3
3 added to the queue
*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:1
4
4 added to the queue

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:3
3->4->0->0->0->

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:

Test Case 2:


*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:2
Queue is empty!! Can not dequeue element

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:

Test Case 3:

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:1
2
2 added to the queue

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:2
2 removed from the queue

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:3
2->0->0->0->0->

*********Queue operations using array*********
------------------------------------------------
Chose one from the below options...
1.Enqueue
2.Dequeue
3.Show
4.Exit
Enter your choice:

*/

Code:
import java.util.Scanner;
public class QueueUsingArrayMain {

    private int capacity=5;
    int queueArr[]= new int[capacity];
    int front;
    int rear;
    int currentSize = 0;

    public QueueUsingArrayMain() {
        front = 0;
        rear = -1;
    }
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!! Can not add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");

        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!! Can not dequeue element");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }
    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }
    public boolean isEmpty() {

        if (currentSize == 0) {
            return true;
        }
        return false;
    }
    public void display()
    {
        for(int i=0;i< queueArr.length;i++)
        {
            System.out.print(queueArr[i]+"->");

        }System.out.println();
    }
    public static void main(String a[]) {

        QueueUsingArrayMain queue = new QueueUsingArrayMain();
        Scanner in = new Scanner(System.in);
        int choice=0;
        while(choice != 4)
        {
            System.out.println("*********Queue operations using array*********");
            System.out.println("------------------------------------------------");
            System.out.println("Chose one from the below options...");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Show\n4.Exit");
            System.out.print("Enter your choice:");
            choice = in.nextInt();
            switch(choice)
            {
                case 1:
                {
                    int sc=in.nextInt();
                    queue.enqueue(sc);
                    break;
                }
                case 2:
                {
                    queue.dequeue();
                    break;
                }
                case 3:
                {
                    queue.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting....");
                    break;
                }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }
}

