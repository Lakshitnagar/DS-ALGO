package ds.binarySearchTree.p1;

import java.io.*;
import ds.binarySearchTree.BinarySearchTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        inOrder(binarySearchTree.root);
    }

    public static void inOrder(BinarySearchTree.BinarySearchTreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
