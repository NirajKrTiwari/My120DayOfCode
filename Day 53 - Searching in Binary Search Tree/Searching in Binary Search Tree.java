import java.util.Scanner;
public class  BST_Search{
    static int counter=0;
    static class Node{
        int value;
        Node left,right;
        public Node(int value)
        {
            this.value=value;
            left=right=null;
        }
    }
    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                node.right = new Node(value);
            }
        }
    }
    public void InOrder(Node node)
    {
        if(node!=null)
        {
            InOrder(node.left);
            System.out.print(node.value+" ");
            InOrder(node.right);
        }
    }
    public void Search(int data,Node node)
    {
        if(node!=null)
        {
            Search(data,node.left);
            if(node.value == data) {
                counter=1;
            }
            Search(data,node.right);
        }

    }

    public static void main(String[] args) {
        BST_Search tree=new BST_Search();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int root_vale=in.nextInt();
        Node root=new Node(root_vale);
        System.out.print("Enter the number of child node you want to enter: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            int data=in.nextInt();
            tree.insert(root, data);
        }
        System.out.println("Tree: ");
        tree.InOrder(root);
        System.out.println("\nEnter the element you want to search");
        int srch=in.nextInt();
        tree.Search(srch,root);
        if(counter==1)
            System.out.println("Element "+srch+" is found");
        else
            System.out.println("Element "+srch+" is not found");
    }
}

