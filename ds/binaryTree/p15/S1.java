package ds.binaryTree.p15;

import java.io.*;

import ds.binaryTree.BinaryTree;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        int[] path = new int[ds.binaryTree.p10.S1.height(binaryTree.root)];
        int ind = 0;

        printRootToLeaf(binaryTree.root, path, ind);
    }

    public static void printRootToLeaf(BinaryTree.BinaryTreeNode root, int[] path, int ind) {
        if(root == null) return;

        path[ind] = root.data;
        ind++;

        if(root.left==null && root.right==null){
            for (int i=0; i<ind; i++){
                System.out.print(path[i]);
            }
            System.out.println("");
        } else {
            printRootToLeaf(root.left, path, ind);
            printRootToLeaf(root.right, path, ind);
        }
    }
}
