package ds.binaryTree.p9;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;
import ds.binaryTree.StackBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        reverseLevelOrder(binaryTree.root);
    }

    public static void reverseLevelOrder(BinaryTree.BinaryTreeNode root) {

        QueueBT queue = new QueueBT();
        StackBT stack = new StackBT();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            stack.push(currNode);

            if (currNode.right != null) queue.enqueue(currNode.right);
            if (currNode.left != null) queue.enqueue(currNode.left);
        }

        stack.printStackBT();
    }
}
