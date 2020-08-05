package ds.binarySearchTree.p3;

import java.io.*;

import ds.binarySearchTree.BinarySearchTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        System.out.println("MIN : "+findMin(binarySearchTree.root).data);
        System.out.println("MAX : "+findMax(binarySearchTree.root).data);
    }

    public static BinarySearchTree.BinarySearchTreeNode findMin(BinarySearchTree.BinarySearchTreeNode root) {
        if(root == null) return null;

        if(root.left == null) return root;
        else return findMin(root.left);
    }

    public static BinarySearchTree.BinarySearchTreeNode findMax(BinarySearchTree.BinarySearchTreeNode root) {
        if(root == null) return null;

        if(root.right == null) return root;
        else return findMax(root.right);
    }
}
