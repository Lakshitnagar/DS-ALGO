package ds.binaryTree.p11;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;
import ds.binaryTree.StackBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(deepestNode(binaryTree.root).data);
    }

    public static BinaryTree.BinaryTreeNode deepestNode(BinaryTree.BinaryTreeNode root) {
        BinaryTree.BinaryTreeNode currNode = null;
        QueueBT queue = new QueueBT();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            currNode = queue.dequeue().data;

            if (currNode.left != null) queue.enqueue(currNode.left);
            if (currNode.right != null) queue.enqueue(currNode.right);
        }

        return currNode;
    }
}
