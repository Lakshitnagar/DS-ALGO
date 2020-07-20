package ds.binaryTree.p8;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(sizeIterative(binaryTree.root));
    }

    public static int sizeIterative(BinaryTree.BinaryTreeNode root) {
        if(root == null) return 0;

        QueueBT queue = new QueueBT();
        queue.enqueue(root);
        int treeSize = 0;

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            treeSize++;

            if (currNode.left != null) queue.enqueue(currNode.left);
            if (currNode.right != null) queue.enqueue(currNode.right);
        }

        return treeSize;
    }
}
