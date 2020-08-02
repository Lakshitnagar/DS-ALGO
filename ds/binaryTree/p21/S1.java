package ds.binaryTree.p21;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(maxWidth(binaryTree.root));
    }

    public static int maxWidth(BinaryTree.BinaryTreeNode root) {
        if (root == null) return 0;

        QueueBT queue = new QueueBT();
        queue.enqueue(root);
        queue.enqueue(null);
        int maxWidth = 0;
        int levelWidth = 0;

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            if (currNode == null) {
                if(levelWidth>maxWidth) maxWidth = levelWidth;
                levelWidth = 0;
                if (!queue.isEmpty()) queue.enqueue(null);
            } else {
                if (currNode.left != null) {
                    levelWidth++;
                    queue.enqueue(currNode.left);
                }
                if (currNode.right != null) {
                    levelWidth++;
                    queue.enqueue(currNode.right);
                }
            }
        }

        return maxWidth;
    }
}
