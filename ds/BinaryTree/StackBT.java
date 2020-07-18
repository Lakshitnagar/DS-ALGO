package ds.binaryTree;

import ds.binaryTree.BinaryTree;

public class StackBT {
    public StackBTNode top = null;

    public StackBTNode push(BinaryTree.BinaryTreeNode data) {
        StackBTNode node = new StackBTNode(data);

        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        return top;
    }

    public StackBTNode pop() {
        StackBTNode poppedNode = null;

        if (top != null) {
            poppedNode = top;
            top = top.next;
        }

        return poppedNode;
    }

    public boolean isEmpty() {
        if (top == null) return true;
        else return false;
    }

    public void printStackBT() {
        StackBTNode currNode = top;

        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public class StackBTNode {
        public BinaryTree.BinaryTreeNode data;
        public StackBTNode next;

        public StackBTNode(BinaryTree.BinaryTreeNode data) {
            this.data = data;
            this.next = null;
        }
    }
}
