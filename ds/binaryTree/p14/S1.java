package ds.binaryTree.p14;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(diameter(binaryTree.root));
    }

    public static int diameter(BinaryTree.BinaryTreeNode root) {
        int leftHeight, rightHeight;
        int leftDiameter, rightDiameter;

        if (root == null) return 0;

        leftHeight = ds.binaryTree.p10.S1.height(root.left);
        rightHeight = ds.binaryTree.p10.S1.height(root.right);

        leftDiameter = diameter(root.left);
        rightDiameter = diameter(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }
}
