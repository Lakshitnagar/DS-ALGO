package ds.binaryTree.p2;

import java.io.*;
import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        inOrder(binaryTree.root);
    }

    public static void inOrder(BinaryTree.BinaryTreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
