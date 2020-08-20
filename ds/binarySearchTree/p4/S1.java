package ds.binarySearchTree.p4;

import java.io.*;

import ds.binarySearchTree.BinarySearchTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        System.out.println("FOUND : "+find(binarySearchTree.root, 5).data);
    }

    public static BinarySearchTree.BinarySearchTreeNode find(BinarySearchTree.BinarySearchTreeNode root, int data) {
        if(root == null) return null;

        if(root.data < data) return find(root.right, data);

        if(root.data > data) return find(root.left, data);

        return root;
    }
}
