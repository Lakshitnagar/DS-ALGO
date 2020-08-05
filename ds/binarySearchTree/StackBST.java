package ds.binarySearchTree;

import ds.binarySearchTree.BinarySearchTree;

public class StackBST {
    public StackBSTNode top = null;

    public void push(BinarySearchTree.BinarySearchTreeNode data) {
        StackBSTNode newNode = new StackBSTNode(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }


    }

    public BinarySearchTree.BinarySearchTreeNode pop() {
        StackBSTNode poppedNode = null;

        if (top != null) {
            poppedNode = top;
            top = top.next;
        }

        return poppedNode.data;
    }

    public boolean isEmpty() {
        if (top == null) return true;
        else return false;
    }

    public void printBST() {
        StackBSTNode currNode = top;

        while (currNode != null) {
            if (currNode.data == null)
                System.out.println("null");
            else
                System.out.println(currNode.data.data);
            currNode = currNode.next;
        }
    }

    public class StackBSTNode {
        public BinarySearchTree.BinarySearchTreeNode data;
        public StackBSTNode next;

        public StackBSTNode(BinarySearchTree.BinarySearchTreeNode data) {
            this.data = data;
            this.next = null;
        }
    }
}
