import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Binary_tree_1 {
    static Node root;

    static void PreOrder(Node root) {
        if (root != null) {
            System.out.print(" " + root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public static void PostOrder(Node root) {
        if (root != null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(" " + root.data);
        }
    }

    public static void InOrder(Node n) {
        if (n != null) {
            InOrder(n.left);
            System.out.print(" " + n.data);
            InOrder(n.right);
        }
    }

    public static void LevelOrder(Node root) {
        if (root == null)
        return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curreNode = q.poll();

            if (curreNode == null) {
                if (q.isEmpty()) {
                    return;
                }
                q.add(null);
                System.out.println();
            }
            else
            {
            if (curreNode.left != null) {
                q.add(curreNode.left);
            }
            if (curreNode.right != null) {
                q.add(curreNode.right);
            }

            System.out.print(" " + curreNode.data);
        }
      }
    }

    public static void InOrder(Node n) {
        if (n != null) {
            InOrder(n.left);
            System.out.print(" " + n.data);
            InOrder(n.right);
        }
    
    static boolean BST(Node root,int num)
    {
        if (root==null) {
            return false;    
    }
        if (root.data==num) {
            return true;
    }
        if (root.data<num) {
            return BST(root.right, num);
            
        }
        else{
            return BST(root.left, num);
        }
        
    }
}
    public static void main(String[] args) {
        // Binary_tree_1 b = new Binary_tree_1();

        // b.root=new Node(1);
        // b.root.left=new Node(2);
        // b.root.right=new Node(3);
        // b.root.left.left=new Node(4);

        /*
               1
             /   \
            2     3
          /  \     \
         4   5      6
         
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("\nPreOrder is: ");
        PreOrder(root);
        System.out.println("\nPostOrder is: ");
        PostOrder(root);
        System.out.println("\nInOrder is: ");
        InOrder(root);
        System.out.println("\nLevelOrder is: ");
        LevelOrder(root);
        System.out.println("\nBST is: ");
        BST(root, 0);


        // System.out.println("\nPreOrder is: ");
        // b.preorder(b.root);
        // System.out.println("\n PostOrder is: ");
        // b.postorder(b.root);
        // System.out.println("\n InOrder is: ");
        // b.inorder(b.root);
        // System.out.println("\n LevelOrder is: ");
        // b.levelorder(b.root);
    }

}
