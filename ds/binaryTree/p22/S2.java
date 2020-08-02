package ds.binaryTree.p22;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        horizontalDistancesIterative(binaryTree.root);
    }

    public static void horizontalDistancesIterative(BinaryTree.BinaryTreeNode root) {
        StackBT stack = new StackBT();
        int[] hash = new int[12]; // We should use actual hash instead of array
        int d = 0;

        while (true){

            while (root!=null){
                hash[root.data] = d;
                stack.push(root);
                root = root.left;
                d--;
            }

            if(stack.isEmpty()) break;

            root = stack.pop().data;
            d = hash[root.data]+1; //Important
            root = root.right;
        }

        for (int i = 0; i < hash.length; i++) {
            System.out.println(i + " -> " + hash[i]);
        }
    }
}
