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
    public static int countNodes(Node root) {
        if (root == null)
            return 0;

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return 1 + leftCount + rightCount;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int totalNodes = countNodes(root);
        System.out.println("Total number of nodes: " + totalNodes);
    }
}
