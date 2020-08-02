package ds.binaryTree.p23;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        verticalSum(binaryTree);
    }

    public static void verticalSum(BinaryTree binaryTree) {
        int[] hash = new int[12]; // We should use actual hash instead of array
        int[] posHDSum = new int[ds.binaryTree.p21.S1.maxWidth(binaryTree.root)]; // We should use actual hash instead of array
        int[] negHDSum = new int[ds.binaryTree.p21.S1.maxWidth(binaryTree.root)]; // We should use actual hash instead of array

        ds.binaryTree.p22.S1.horizontalDistances(binaryTree.root, hash, 0);

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
