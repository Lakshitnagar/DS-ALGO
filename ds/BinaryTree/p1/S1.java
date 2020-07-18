package ds.binaryTree.p1;

import java.io.*;
import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        preOrder(binaryTree.root);
    }

    public static void preOrder(BinaryTree.BinaryTreeNode root){
        if(root!=null){
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
