package test;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

/* Class to find size of Binary Tree */
class BinaryTree {
    Node root;

    // Function to return the size of binary tree
    int size() { return size(root); }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    /* computes number of nodes in tree */
    public int size(Node n) {
        if (n.left == null && n.right == null) {
            return 0;
        } else if (n.left == null) {
            return size(n.right) + 1;
        } else if (n.right == null) {
            return size(n.left) + 1;
        } else {
            int l1 = size(n.left);
            int l2 = size(n.right);
            return (Math.max(l1, l2)) + 1;
        }
    }
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

}