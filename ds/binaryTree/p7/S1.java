package ds.binaryTree.p7;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        insert(binaryTree.root, 3);

        ds.binaryTree.p4.S1.levelOrder(binaryTree.root);
    }

    public static void insert(BinaryTree.BinaryTreeNode root, int x) {
        BinaryTree.BinaryTreeNode newNode = new BinaryTree.BinaryTreeNode(x);

        if (root == null) {
            root = newNode;
            return;
        }

        QueueBT queue = new QueueBT();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            if (currNode.left == null) {
                currNode.left = newNode;
                return;
            }

            if (currNode.right == null) {
                currNode.right = newNode;
                return;
            }

            if (currNode.left != null) queue.enqueue(currNode.left);
            if (currNode.right != null) queue.enqueue(currNode.right);
        }
    }
}
