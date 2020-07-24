package ds.binaryTree.p17;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        ds.binaryTree.p4.S1.levelOrder(binaryTree.root);

        covertToMirror(binaryTree.root);

        ds.binaryTree.p4.S1.levelOrder(binaryTree.root);
    }

    public static void covertToMirror(BinaryTree.BinaryTreeNode root) {
        if (root == null) return;

        BinaryTree.BinaryTreeNode tempNode;

        covertToMirror(root.left);
        covertToMirror(root.right);

        tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
    }
}
