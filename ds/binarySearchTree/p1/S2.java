package ds.binarySearchTree.p1;

import java.io.*;
import ds.binarySearchTree.BinarySearchTree;
import ds.binarySearchTree.StackBST;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        inOrderIterative(binarySearchTree.root);
    }

    public static void inOrderIterative(BinarySearchTree.BinarySearchTreeNode root){
        StackBST stack = new StackBST();

        while (true){

            while (root!=null){
                stack.push(root);
                root = root.left;
            }

            if(stack.isEmpty()) break;

            root = stack.pop();

            System.out.println(root.data);

            root = root.right;
        }
    }
}
