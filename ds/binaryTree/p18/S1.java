package ds.binaryTree.p18;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        int[] path = new int[ds.binaryTree.p10.S1.height(binaryTree.root)];
        int ind = -1;

        printRootToNode(binaryTree.root, 9, path, ind);

        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i] + "->");
        }
    }

    public static boolean printRootToNode(BinaryTree.BinaryTreeNode root, int dest, int[] path, int ind) {
        if (root == null) return false;

        ind++;
        if (root.data == dest || printRootToNode(root.left, dest, path, ind) || printRootToNode(root.right, dest, path, ind)) {
            path[ind] = root.data;
            return true;
        }

        return false;
    }
}
