package ds.binaryTree.p22;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        int[] hash = new int[12]; // We should use actual hash instead of array

        horizontalDistances(binaryTree.root, hash, 0);

        for (int i = 0; i < hash.length; i++) {
            System.out.println(i + " -> " + hash[i]);
        }
    }

    public static void horizontalDistances(BinaryTree.BinaryTreeNode root, int[] hash, int d) {
        if (root == null) return;

        hash[root.data] = d;
        horizontalDistances(root.left, hash, d-1);
        horizontalDistances(root.right, hash, d+1);
    }
}
