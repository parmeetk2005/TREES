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
    public static boolean search(Node root, int target) {
        if (root == null)
            return false;

        if (root.data == target)
            return true;
        return search(root.left, target) || search(root.right, target);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int target = 5;
        boolean found = search(root, target);

        if (found)
            System.out.println(target + " is found in the tree.");
        else
            System.out.println(target + " is NOT found in the tree.");
    }
}
