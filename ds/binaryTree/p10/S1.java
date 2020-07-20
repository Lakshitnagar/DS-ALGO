package ds.binaryTree.p10;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(height(binaryTree.root));
    }

    public static int height(BinaryTree.BinaryTreeNode root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight > rightHeight) return leftHeight + 1;
        else return rightHeight + 1;
    }
}
