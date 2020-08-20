package ds.binarySearchTree.p4;

import java.io.*;

import ds.binarySearchTree.BinarySearchTree;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        System.out.println("FOUND : "+findIterative(binarySearchTree.root, 5).data);
    }

    public static BinarySearchTree.BinarySearchTreeNode findIterative(BinarySearchTree.BinarySearchTreeNode root, int data) {
        if(root == null) return null;

        while(root!=null){
            if(root.data == data) return root;
            else {
                if(root.data < data) root = root.right;
                if(root.data > data) root = root.left;
            }
        }

        return null;
    }
}
