package src.binaryTree;

public class BinaryTree {

    //Algorithm Inorder(tree)
   //1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   //2. Visit the root.
   //3. Traverse the right subtree, i.e., call Inorder(right-subtree)
    //8, 15, 3, 20, 10, 16
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
    
    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ", ");

        if(root.left != null) {
            preOrderTraversal(root.left);
        }

        if(root.right != null) {
            preOrderTraversal(root.right);
        }

    }

    public static void postOrderTraversal(Node root) {
        if (root == null)
            return;

        // Traverse left
        postOrderTraversal(root.left);
        // Traverse right
        postOrderTraversal(root.right);
        // Traverse root
        System.out.print(root.data + ", ");
    }

    public static void main(String[] args) {
        Node root = new Node(20, null, null);
        root.left = new Node(15, null, null);
        root.right = new Node(10, null, null);
        root.left.left = new Node(8, null, null);
        root.left.right = new Node(3, null, null);
        root.right.right = new Node(16, null, null);

        System.out.print("In Order Traversal : ");
        BinaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.print("Pre Order Traversal : ");
        BinaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.print("Post Order Traversal : ");
        BinaryTree.postOrderTraversal(root);
    }

}
