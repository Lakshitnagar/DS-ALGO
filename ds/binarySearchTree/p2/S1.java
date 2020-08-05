package ds.binarySearchTree.p2;

import java.io.*;

import ds.binarySearchTree.BinarySearchTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        insert(binarySearchTree.root, 0);

        ds.binarySearchTree.p1.S1.inOrder(binarySearchTree.root);
    }

    public static BinarySearchTree.BinarySearchTreeNode insert(BinarySearchTree.BinarySearchTreeNode root, int data) {
        if (root == null) {
            root = BinarySearchTree.createNode(data);
        } else {
            if (data < root.data) root.left = insert(root.left, data);
            else if (data > root.data) root.right = insert(root.right, data); // else if is the important because it ignores equality
        }

        return root;
    }
}
