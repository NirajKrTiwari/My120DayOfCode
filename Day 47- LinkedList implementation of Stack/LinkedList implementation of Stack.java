/*
LinkedList implementation of Stack
-----------------------------------

Test Case 1:
Input:
Press1: To push
Press2: To pop
Press3: To display top element
Press4: To check stack is empty or not
Press6: To exit
2
Output:
Stack Underflow

Test Case 2:
Input:
Press1: To push
Press2: To pop
Press3: To display top element
Press4: To check stack is empty or not
Press6: To exit
1
3
Press1: To push
Press2: To pop
Press3: To display top element
Press4: To check stack is empty or not
Press6: To exit
1
4
Press1: To push
Press2: To pop
Press3: To display top element
Press4: To check stack is empty or not
Press6: To exit
Output:
Inserting 3
Inserting 4

Test Case 3:

Input:
Press1: To push
Press2: To pop
Press3: To display top element
Press4: To check stack is empty or not
Press6: To exit
3

Output:
The stack is empty

Test Case 4:
Input:
Press1: To push
Press2: To pop
Press3: To display top element
Press4: To check stack is empty or not
Press6: To exit
4
Output:
The stack is empty

*/

Code:
import java.util.Scanner;
class Node
{
    int data;       
    Node next; 
}
 
class Stack
{
    private Node top;
    private int nodesCount;
 
    public Stack() {
        this.top = null;
        this.nodesCount = 0;
    }
 
   
    public void push(int x)       
    {
        Node node = new Node();
        if (node == null)
        {
            System.out.println("Heap Overflow");
            return;
        }
 
        System.out.println("Inserting " + x);

        node.data = x;

        node.next = top;

        top = node;

        this.nodesCount += 1;
    }
 
    public boolean isEmpty() {
        return top == null;
    }
    public int peek()
    {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }
    public int pop()    
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
        int top = peek();
 
        System.out.println("Removing " + top);
        this.nodesCount -= 1;
        this.top = (this.top).next;
 
        return top;
    }
    public int size() {
        return this.nodesCount;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack stack = new Stack();
        int a=0;
        int value;
        while(a!=5)
        {
            System.out.println("Press1: To push\nPress2: To pop\nPress3: To display top element\nPress4: To check stack is empty or not\nPress6: To exit");
            a=in.nextInt();
            switch(a)
            {
             case 1:{
                value=in.nextInt();
                stack.push(value);
                break;}
            case 2:{
                stack.pop();
                break;}
            case 3:{
                 System.out.println("The top element is " + stack.peek());
                 break;}
            case 4:{
                if (stack.isEmpty()) {
                System.out.println("The stack is empty");
                 }
                else {
                 System.out.println("The stack is not empty");
                }       
                }
            case 5:
                a=5;
                break;
            }
        }
    }
}

