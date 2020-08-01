package ds.binaryTree.p18;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S2 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        int[] path = printRootToNodeIterative(binaryTree.root, 6);

        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i] + "->");
        }
    }

    public static int[] printRootToNodeIterative(BinaryTree.BinaryTreeNode root, int dest) {
        boolean nodeFound = false;
        int[] path = new int[ds.binaryTree.p10.S1.height(root)];
        int ind = 0;

        BinaryTree.BinaryTreeNode currNode = root;

        StackBT stack = new StackBT();

        while (true) {

            while (currNode != null) {
                stack.push(currNode);

                if (currNode.data == dest) {
                    nodeFound = true;
                    break;
                }

                currNode = currNode.left;
                stack.push(null);
            }

            if (nodeFound) break;

            if (stack.isEmpty()) break;

            if (stack.top.data == null) {
                stack.pop();
            }

            if (stack.top.data == null) {
                stack.pop();
                stack.pop();
            } else {
                currNode = stack.top.data.right;
                stack.push(null);
                stack.push(null);
            }


        }

        StackBT stack2 = new StackBT();

        while (!stack.isEmpty()) {
            currNode = stack.pop().data;
            if (currNode != null) {
                stack2.push(currNode);
            }
        }

        stack2.printStackBT();

        while (!stack2.isEmpty()) {
            currNode = stack2.pop().data;
            if (currNode != null) {
                path[ind++] = currNode.data;
            }
        }

        return path;
    }
}
