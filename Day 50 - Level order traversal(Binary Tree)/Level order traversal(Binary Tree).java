/*
Level order traversal(Binary Tree)
----------------------------------
Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.

GFG Link: https://practice.geeksforgeeks.org/problems/level-order-traversal/1

Test Case 1:
Input:
    1
  /   \ 
 3     2

Output:1 3 2

Test Case 2:
Input:
        10
     /      \
    20       30
  /   \
 40   60

Output:10 20 30 40 60

*/

Code:

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>(); 

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int t=Integer.parseInt(br.readLine());

	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
                ArrayList <Integer> res = g.levelOrder(root);
                for (Integer num : res) System.out.print(num + " ");
    			System.out.println();
                t--;

        }
    }

}

class Solution
{
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> list = new ArrayList<>();
          if(node==null)
            return list ;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node currNode = q.poll();
                list.add(currNode.data);
                if(currNode.left != null)
                    q.add(currNode.left);
                if(currNode.right != null)
                     q.add(currNode.right);

        }
        return list;
    }
}