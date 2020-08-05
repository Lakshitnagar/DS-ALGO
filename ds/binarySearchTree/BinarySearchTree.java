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

        binarySearchTree.root = ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 1);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 7);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 2);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 11);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 4);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 9);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 5);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 6);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 8);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 3);
        ds.binarySearchTree.p2.S1.insert(binarySearchTree.root, 10);

        return binarySearchTree;
    }
}
