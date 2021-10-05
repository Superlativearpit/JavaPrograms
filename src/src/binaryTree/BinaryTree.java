package src.binaryTree;

public class BinaryTree {

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            inOrderTraversal(root.left);
        }

        System.out.print(root.data + ", ");

        if (root.right != null) {
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20, null, null);
        root.left = new Node(15, null, null);
        root.right = new Node(10, null, null);
        root.left.left = new Node(8, null, null);
        root.left.right = new Node(3, null, null);
        root.right.right = new Node(16, null, null);

        BinaryTree.inOrderTraversal(root);

    }

}
