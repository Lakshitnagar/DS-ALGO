package ds.binaryTree.p19;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(LCA(binaryTree));
    }

    public static int LCA(BinaryTree binaryTree) {
        int[] path1 = ds.binaryTree.p18.S2.printRootToNodeIterative(binaryTree.root, 10);

        int[] path2 = ds.binaryTree.p18.S2.printRootToNodeIterative(binaryTree.root, 3);

        for (int i = 0; i < path1.length; i++) {
            if(path1[i] != path2[i]){
                return path1[i-1];
            }
        }

        return -1;
    }
}
