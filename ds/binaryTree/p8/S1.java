package ds.binaryTree.p8;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(size(binaryTree.root));
    }

    public static int size(BinaryTree.BinaryTreeNode root) {
        if (root == null) return 0;

        return size(root.left) + 1 + size(root.right);
    }
}
