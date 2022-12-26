public class MirrorBinaryTree
{
        static class Node
        {
           int data;
           Node left;
           Node right;
        }
        public static Node createNode(int val)
        {
            Node newNode = new Node();
            newNode.data = val;
            newNode.left = null;
            newNode.right = null;
            return newNode;
        }
        public static void InOrder(Node root)
        {
            if (root == null)
                return;

            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
        public static Node MirrorTreeInorder(Node root)
        {
            if (root == null)
                return null;

            Node left = MirrorTreeInorder(root.left);
            Node right = MirrorTreeInorder(root.right);

            root.left = right;
            root.right = left;

            return root;
        }
        public static void main(String args[])
        {
            Node tree = createNode(5);
            tree.left = createNode(3);
            tree.right = createNode(6);
            tree.left.left = createNode(2);
            tree.left.right = createNode(4);
            System.out.print("Inorder of original tree: ");
            InOrder(tree);
            MirrorTreeInorder(tree);
            System.out.print("\nInorder of mirror tree: ");
            InOrder(tree);
        }
}

