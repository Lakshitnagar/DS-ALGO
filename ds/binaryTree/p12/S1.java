package ds.binaryTree.p12;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        deleteNode(binaryTree.root, 3);

        ds.binaryTree.p4.S1.levelOrder(binaryTree.root);
    }

    public static void deleteNode(BinaryTree.BinaryTreeNode root, int x) {
        BinaryTree.BinaryTreeNode nodeToDelete = search(root, 3);
        BinaryTree.BinaryTreeNode deepestNode = ds.binaryTree.p11.S1.deepestNode(root);

        if(nodeToDelete==null) return;

        nodeToDelete.data = deepestNode.data;
        deepestNode = null;
    }

    public static BinaryTree.BinaryTreeNode search(BinaryTree.BinaryTreeNode root, int x) {
        if (root == null) return null;

        if (root.data == x) return root;

        BinaryTree.BinaryTreeNode leftSearch = search(root.left, x);
        if (leftSearch != null) return leftSearch;

        BinaryTree.BinaryTreeNode rightSearch = search(root.right, x);
        if (rightSearch != null) return rightSearch;

        return null;
    }
}
