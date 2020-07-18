package ds.binaryTree;

public class BinaryTree {
    public BinaryTreeNode root;

    public static class BinaryTreeNode {
        public int data;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static BinaryTreeNode createNode(int data){
        return new BinaryTreeNode(data);
    }

    public static BinaryTree createCustomTree(){
        // Creation of Binary Tree
        BinaryTree binaryTree = new BinaryTree();

        // Populating data
        BinaryTreeNode node1 = createNode(1);
        BinaryTreeNode node2 = createNode(2);
        BinaryTreeNode node3 = createNode(3);
        BinaryTreeNode node4 = createNode(4);
        BinaryTreeNode node5 = createNode(5);
        BinaryTreeNode node6 = createNode(6);
        BinaryTreeNode node7 = createNode(7);
        BinaryTreeNode node8 = createNode(8);
        BinaryTreeNode node9 = createNode(9);
        BinaryTreeNode node10 = createNode(10);
        BinaryTreeNode node11 = createNode(11);

        node4.right = node7;

        node5.left = node8;
        node5.right = node9;

        node6.left = node10;
        node6.right = node11;

        node3.left = node6;

        node2.left = node4;
        node2.right = node5;

        node1.left = node2;
        node1.right = node3;

        binaryTree.root = node1;

        return binaryTree;
    }
}
