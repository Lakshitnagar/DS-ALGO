package ds.binaryTree.p10;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(heightIterative(binaryTree.root));
    }

    public static int heightIterative(BinaryTree.BinaryTreeNode root) {
        if (root == null) return 0;

        QueueBT queue = new QueueBT();
        queue.enqueue(root);
        queue.enqueue(null);
        int treeHeight = 0;

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            if (currNode == null) {
                treeHeight++;
                if (!queue.isEmpty()) queue.enqueue(null);
            } else {
                if (currNode.left != null) queue.enqueue(currNode.left);
                if (currNode.right != null) queue.enqueue(currNode.right);
            }
        }

        return treeHeight;
    }
}
