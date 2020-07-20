package ds.binaryTree.p5;

import java.io.*;
import ds.binaryTree.BinaryTree;
import ds.binaryTree.QueueBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println(findMaxIterative(binaryTree.root));
    }

    public static int findMaxIterative(BinaryTree.BinaryTreeNode root){
        int max = Integer.MIN_VALUE;
        QueueBT queue = new QueueBT();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            BinaryTree.BinaryTreeNode currNode = queue.dequeue().data;

            if(max<currNode.data) max = currNode.data;

            if(currNode.left!=null) queue.enqueue(currNode.left);
            if(currNode.right!=null) queue.enqueue(currNode.right);
        }

        return max;
    }
}
