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
        public static Node minElement(Node root)
        {
            if(root.left==null)
                return root;
            else
                return minElement(root.left);
        }
        public static Node delElement(Node root,int value1)
        {
            if(root==null)
                return null;
            if(root.value>value1)
                root.left=delElement(root.left,value1);
            else if(root.value<value1)
                root.right=delElement(root.right,value1);
            else {
                if(root.left!=null && root.right!=null)
                {
                    Node temp=root;
                    Node minNode=minElement(temp.right);
                    root.value=minNode.value;
                    root.right=delElement(root.right,minNode.value);
                }
                else if (root.left!=null)
                    root=root.left;
                else if (root.right!=null)
                    root=root.right;
                else
                    root=null;
            }
            return root;
        }

    public static void main(String[] args) {
        BST_Deletion tree=new BST_Deletion();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int root_vale=in.nextInt();
        Node root=new Node(root_vale);
        System.out.print("Enter the number of child nodes you want to enter: ");
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            int data=in.nextInt();
            tree.insert(root, data);
        }
        System.out.print("Inorder Traversal: ");
        tree.InOrder(root);
        System.out.println();
        System.out.print("Enter element You want to delete: ");
        int del=in.nextInt();
        System.out.println("After Deletion: ");
        delElement(root,del);
        tree.InOrder(root);
    }
}

