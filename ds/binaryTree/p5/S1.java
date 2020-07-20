package ds.binaryTree.p5;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(findMax(binaryTree.root));
    }

    public static int findMax(BinaryTree.BinaryTreeNode root) {
        int rootValue, leftValue, rightValue;
        int max = Integer.MIN_VALUE;

        if (root != null) {
            rootValue = root.data;
            leftValue = findMax(root.left);
            rightValue = findMax(root.right);

            if (leftValue > rightValue) max = leftValue;
            else max = rightValue;

            if(rootValue>max) max = rootValue;
        }

        return max;
    }
}
