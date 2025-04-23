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
    public static void printNodesAtLevel(Node root, int level) {
        if (root == null)
            return;

        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printNodesAtLevel(root.left, level - 1);
            printNodesAtLevel(root.right, level - 1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int level = 3;
        System.out.print("Nodes at level " + level + ": ");
        printNodesAtLevel(root, level);
    }
}
