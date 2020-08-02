package ds.binaryTree.p23;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        verticalSum(binaryTree.root);
    }

    public static void verticalSum(BinaryTree.BinaryTreeNode root) {
        int[] hash = new int[12]; // We should use actual hash instead of array
        int[] posHDSum = new int[ds.binaryTree.p21.S1.maxWidth(root)]; // We should use actual hash instead of array
        int[] negHDSum = new int[ds.binaryTree.p21.S1.maxWidth(root)]; // We should use actual hash instead of array

        StackBT stack = new StackBT();
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
            if (hash[i] < 0) {
                negHDSum[hash[i]*-1] = negHDSum[hash[i]*-1] + i;
            } else {
                posHDSum[hash[i]] = posHDSum[hash[i]] + i;
            }
        }

        for (int i = 1; i < negHDSum.length; i++) {
            System.out.println(-1*i + " -> " + negHDSum[i]);
        }

        for (int i = 0; i < posHDSum.length; i++) {
            System.out.println(i + " -> " + posHDSum[i]);
        }
    }
}
