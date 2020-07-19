package ds.binaryTree.p4;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        levelOrder(binaryTree.root);
    }

    public static void levelOrder(BinaryTree.BinaryTreeNode root) {
        QueueBT queue = new QueueBT();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            System.out.println(currNode.data);

            if(currNode.left!=null) queue.enqueue(currNode.left);
            if(currNode.right!=null) queue.enqueue(currNode.right);
        }
    }
}
