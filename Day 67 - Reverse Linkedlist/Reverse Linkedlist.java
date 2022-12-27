public class ReverseLinkedlist {
        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }
        Node reverse(Node node)
        {
            Node temp2 = null;
            Node head = node;
            Node temp1 = null;
            while (head != null)
            {
                temp1 = head.next;
                head.next = temp2;
                temp2 = head;
                head = temp1;
            }
            node = temp2;
            return node;
        }
        void printList(Node node)
        {
            while (node != null) {
                if(node.next==null)
                    System.out.print(node.data);
                else
                    System.out.print(node.data + "->");
                node = node.next;
            }
        }
        public static void main(String[] args)
        {
            ReverseLinkedlist list = new ReverseLinkedlist();
            list.head = new Node(85);
            list.head.next = new Node(15);
            list.head.next.next = new Node(4);
            list.head.next.next.next = new Node(20);

            System.out.println("Given linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }
}


