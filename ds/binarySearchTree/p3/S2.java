package ds.binarySearchTree.p3;

import java.io.*;

import ds.binarySearchTree.BinarySearchTree;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        System.out.println("MIN : "+findMinIterative(binarySearchTree.root).data);
        System.out.println("MAX : "+findMaxIterative(binarySearchTree.root).data);
    }

    public static BinarySearchTree.BinarySearchTreeNode findMinIterative(BinarySearchTree.BinarySearchTreeNode root) {
        BinarySearchTree.BinarySearchTreeNode currNode = root;

        while (currNode != null) {
            if(currNode.left == null) return currNode;
            else currNode = currNode.left;
        }

        return null;
    }

    public static BinarySearchTree.BinarySearchTreeNode findMaxIterative(BinarySearchTree.BinarySearchTreeNode root) {
        BinarySearchTree.BinarySearchTreeNode currNode = root;

        while (currNode != null) {
            if(currNode.right == null) return currNode;
            else currNode = currNode.right;
        }

        return null;
    }
}
