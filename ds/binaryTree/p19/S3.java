package ds.binaryTree.p19;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S3 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        System.out.println("result " + LCA_iterative(binaryTree.root, 10, 11).data);
    }

    public static BinaryTree.BinaryTreeNode LCA_iterative(BinaryTree.BinaryTreeNode root, int n1, int n2) {
        BinaryTree.BinaryTreeNode currNode = root;
        BinaryTree.BinaryTreeNode LCA = null;
        StackBT stack = new StackBT();

        while (true) {


            while (currNode != null) {
                stack.push(currNode);

                if (LCA == null && (currNode.data == n1 || currNode.data == n2)) {

                    LCA = currNode;
                } else if (LCA != null && (currNode.data == n1 || currNode.data == n2)) {
                    return LCA;
                }

                currNode = currNode.left;
                stack.push(null);
            }


            if (stack.isEmpty()) break;

            if (stack.top.data == null) {
                stack.pop();
            }

            if (stack.top.data == null) {
                stack.pop();

                if (stack.pop().data == LCA) {
                    if(stack.top.data==null){
                        stack.pop();

                        if(stack.top.data==null){
                            stack.pop();
                            LCA = stack.top.data;
                            stack.push(null);
                            stack.push(null);
                        } else {
                            LCA = stack.top.data;
                            stack.push(null);
                        }
                    }
                }
            } else {
                currNode = stack.top.data.right;
                stack.push(null);
                stack.push(null);
            }
        }

        return LCA;
    }
}
