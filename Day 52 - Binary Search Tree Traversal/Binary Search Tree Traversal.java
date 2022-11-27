
import java.util.Scanner;
public class BST_Deletion {
    static class Node{
        int value;
        Node left,right;
        public Node(int value)
        {
            this.value=value;
            left=right=null;
        }
    }
    public void insert(Node node,int value) {
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
        public void PreOrder(Node node)
        {
            if(node!=null)
            {
                System.out.print(node.value+" ");
                PreOrder(node.left);
                PreOrder(node.right);
            }
        }
    public void PostOrder(Node node)
    {
        if(node!=null)
        {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.value+" ");
        }
    }

    public static void main(String[] args) {
        BST_Deletion tree=new BST_Deletion();
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
        System.out.print("Inorder Traversal: ");
        tree.InOrder(root);
        System.out.print("\nPreorder Traversal: ");
        tree.PreOrder(root);
        System.out.print("\nPostorder Traversal: ");
        tree.PostOrder(root);
    }
}

