package ds.binaryTree.p16;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(checkRootToLeafSum(binaryTree.root, 14));
    }

    public static boolean checkRootToLeafSum(BinaryTree.BinaryTreeNode root, int sum) {
        if (root == null) return (sum==0);

        int remSum = sum - root.data;

        return checkRootToLeafSum(root.left, remSum) || checkRootToLeafSum(root.right, remSum);
    }
}
