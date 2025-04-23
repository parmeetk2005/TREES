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
    public static void insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp.left == null) {
                temp.left = new Node(value);
                return;
            } else {
                queue.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node(value);
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        System.out.print("Inorder before insertion: ");
        inorder(root);
        System.out.println();

        int valueToInsert = 5;
        insertNode(root, valueToInsert);

        System.out.print("Inorder after insertion: ");
        inorder(root);
    }
}
