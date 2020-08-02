package ds.binaryTree.p19;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(LCA_recursive(binaryTree.root, 8, 4).data);
    }

    public static BinaryTree.BinaryTreeNode LCA_recursive(BinaryTree.BinaryTreeNode root, int n1, int n2) {
        // Base case
        if (root == null)
            return null;

        if (root.data == n1 || root.data == n2)
            return root;

        // Look for keys in left and right subtrees
        BinaryTree.BinaryTreeNode left_lca = LCA_recursive(root.left, n1, n2);
        BinaryTree.BinaryTreeNode right_lca = LCA_recursive(root.right, n1, n2);

        if (left_lca != null && right_lca != null)
            return root;

        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }
}
