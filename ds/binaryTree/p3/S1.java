package ds.binaryTree.p3;

import java.io.*;
import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        postOrder(binaryTree.root);
    }

    public static void postOrder(BinaryTree.BinaryTreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }
}
