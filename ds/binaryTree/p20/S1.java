package ds.binaryTree.p20;

import java.io.*;

import ds.binaryTree.BinaryTree;
import ds.binaryTree.StackBT;

public class S1 {

    public static void main(String args[]) {

        // Creation of binary tree
        BinaryTree binaryTree = BinaryTree.createCustomTree();

        zigzagLevelOrder(binaryTree.root);
    }

    public static void zigzagLevelOrder(BinaryTree.BinaryTreeNode root) {
        if (root == null) return;

        StackBT currLevel = new StackBT();
        StackBT nextLevel = new StackBT();
        BinaryTree.BinaryTreeNode currNode;
        boolean leftToRight = true;
        currLevel.push(root);

        while(!currLevel.isEmpty()){
            currNode = currLevel.pop().data;

            if(currNode!=null){
                System.out.println(currNode.data);

                if(leftToRight){
                    if (currNode.left != null) nextLevel.push(currNode.left);
                    if (currNode.right != null) nextLevel.push(currNode.right);
                } else {
                    if (currNode.right != null) nextLevel.push(currNode.right);
                    if (currNode.left != null) nextLevel.push(currNode.left);
                }
            }

            if(currLevel.isEmpty()){
                leftToRight = !leftToRight;
                StackBT tempStack;
                tempStack = currLevel;
                currLevel = nextLevel;
                nextLevel = tempStack;
            }
        }
    }
}
