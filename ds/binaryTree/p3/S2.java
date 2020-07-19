package ds.binaryTree.p3;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        postOrderIterative(binaryTree.root);
    }

    public static void postOrderIterative(BinaryTree.BinaryTreeNode root) {
        StackBT stack = new StackBT();
        stack.push(root);
        BinaryTree.BinaryTreeNode prevNode = null;

        while (!stack.isEmpty()) {

            BinaryTree.BinaryTreeNode currNode = stack.top.data;

            if (prevNode == null || prevNode.left == currNode || prevNode.right == currNode) {

                if (currNode.left != null) {

                    stack.push(currNode.left);

                } else if (currNode.right != null) {

                    stack.push(currNode.right);

                } else {
                    stack.pop();
                    System.out.println(currNode.data);
                }
            } else if (currNode.left == prevNode) {

                if(currNode.right!=null){

                    stack.push(currNode.right);

                } else {
                    stack.pop();
                    System.out.println(currNode.data);
                }
            } else if (currNode.right == prevNode){
                stack.pop();
                System.out.println(currNode.data);
            }

            prevNode = currNode;
        }
    }
}
