package ds.binaryTree.p6;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(searchIterative(binaryTree.root, 3));
    }

    public static boolean searchIterative(BinaryTree.BinaryTreeNode root, int x) {
        QueueBT queue = new QueueBT();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            if (currNode.data == x) return true;

            if (currNode.left != null) queue.enqueue(currNode.left);
            if (currNode.right != null) queue.enqueue(currNode.right);
        }

        return false;
    }
}
