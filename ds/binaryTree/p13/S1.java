package ds.binaryTree.p13;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree1 = BinaryTree.createCustomTree();
        BinaryTree binaryTree2 = BinaryTree.createCustomTree();

        System.out.println(isIdentical(binaryTree1.root, binaryTree2.root));
    }

    public static boolean isIdentical(BinaryTree.BinaryTreeNode root1, BinaryTree.BinaryTreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        return (root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
    }
}
