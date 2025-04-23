import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree {
    public static int countAndPrintLeafNodes(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            System.out.println("Leaf node: " + root.data);
            return 1;
        }

        int leftLeaves = countAndPrintLeafNodes(root.left);
        int rightLeaves = countAndPrintLeafNodes(root.right);

        return leftLeaves + rightLeaves;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int leafCount = countAndPrintLeafNodes(root);
        System.out.println("Total number of leaf nodes: " + leafCount);
    }
}
