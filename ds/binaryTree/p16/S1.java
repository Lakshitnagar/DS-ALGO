package ds.binaryTree.p16;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        int[] path = new int[ds.binaryTree.p10.S1.height(binaryTree.root)];
        int ind = 0;

        System.out.println(checkRootToLeafSum(binaryTree.root, path, ind, 14));
    }

    public static boolean checkRootToLeafSum(BinaryTree.BinaryTreeNode root, int[] path, int ind, int sum) {
        if (root == null) return false;

        path[ind] = root.data;
        ind++;

        if (root.left == null && root.right == null) {
            int pathSum = 0;
            for (int i = 0; i < ind; i++) {
                pathSum = pathSum + path[i];
            }

            if (pathSum == sum) return true;
        } else {
            boolean leftSum = checkRootToLeafSum(root.left, path, ind, sum);
            if (leftSum) return true; // returning true immediately, this will stop going further into the tree
            boolean rightSum = checkRootToLeafSum(root.right, path, ind, sum);
            if (rightSum) return true;
        }

        return false;
    }
}
