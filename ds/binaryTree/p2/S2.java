package ds.binaryTree.p2;

import java.io.*;
import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        inOrderIterative(binaryTree.root);
    }

    public static void inOrderIterative(BinaryTree.BinaryTreeNode root){
        StackBT stack = new StackBT();

        while (true){

            while (root!=null){
                stack.push(root);
                root = root.left;
            }

            if(stack.isEmpty()) break;

            root = stack.pop().data;

            System.out.println(root.data);

            root = root.right;
        }
    }
}
