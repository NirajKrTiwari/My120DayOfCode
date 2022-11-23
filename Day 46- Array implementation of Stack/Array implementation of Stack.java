public class QueueUsingArrayMain {

    private int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize = 0;

    public QueueUsingArrayMain(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
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
            System.out.print(queueArr[i]);
        }
    }
    public static void main(String a[]) {

        QueueUsingArrayMain queue = new QueueUsingArrayMain(5);
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("*********Queue operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        while(choice != 4)
        {
            System.out.println("\nChose one from the below options...\n");
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Show\n4.Exit");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
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
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }
