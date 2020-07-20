package ds.binaryTree.p6;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(search(binaryTree.root, 3));
    }

    public static boolean search(BinaryTree.BinaryTreeNode root, int x) {
        if (root == null) return false;

        if (root.data == x) return true;
        else {
            return search(root.left, x) || search(root.right, x);
        }
    }
}
