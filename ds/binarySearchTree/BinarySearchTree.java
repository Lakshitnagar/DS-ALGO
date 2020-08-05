package ds.binarySearchTree;

public class BinarySearchTree {
    public BinarySearchTreeNode root;

    public static class BinarySearchTreeNode {
        public int data;
        public BinarySearchTreeNode left;
        public BinarySearchTreeNode right;

        public BinarySearchTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static BinarySearchTreeNode createNode(int data) {
        return new BinarySearchTreeNode(data);
    }

    public static BinarySearchTree createCustomTree() {
        // Creation of Binary Tree
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        BinarySearchTreeNode node1 = createNode(1);
        BinarySearchTreeNode node2 = createNode(2);
        BinarySearchTreeNode node3 = createNode(3);

        binarySearchTree.root = node2;
        binarySearchTree.root.left = node1;
        binarySearchTree.root.right = node3;

        return binarySearchTree;
    }
}
