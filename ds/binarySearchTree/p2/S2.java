package ds.binarySearchTree.p2;

import java.io.*;

import ds.binarySearchTree.BinarySearchTree;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary search tree
        BinarySearchTree binarySearchTree = BinarySearchTree.createCustomTree();

        insertIterative(binarySearchTree.root, 0);

        ds.binarySearchTree.p1.S1.inOrder(binarySearchTree.root);
    }

    public static void insertIterative(BinarySearchTree.BinarySearchTreeNode root, int data) {
        BinarySearchTree.BinarySearchTreeNode currNode = root;
        BinarySearchTree.BinarySearchTreeNode newNode = BinarySearchTree.createNode(data);

        while (currNode != null) {
            if(data == currNode.data) return;

            if (data < currNode.data) {
                if (currNode.left == null) {
                    currNode.left = newNode;
                    return;
                } else {
                    currNode = currNode.left;
                }
            } else if (data > currNode.data) {
                if (currNode.right == null) {
                    currNode.right = newNode;
                    return;
                } else {
                    currNode = currNode.right;
                }
            }
        }
    }
}
