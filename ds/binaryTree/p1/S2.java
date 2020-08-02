package ds.binaryTree.p1;

import java.io.*;
import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        preOrderIterative(binaryTree.root);
    }

    public static void preOrderIterative(BinaryTree.BinaryTreeNode root){
        StackBT stack = new StackBT();

        while (true){

            while (root!=null){
                System.out.println(root.data);
                stack.push(root);
                root = root.left;
            }

            if(stack.isEmpty()) break;

            root = stack.pop().data.right;
        }
    }
}
