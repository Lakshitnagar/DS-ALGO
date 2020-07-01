package ds.stack;

public class Stack {
    public StackNode top = null;

    public StackNode push(int data) {
        StackNode node = new StackNode(data);

        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }

        return top;
    }

    public StackNode pop() {
        StackNode poppedNode = null;

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

    public void printStack() {
        StackNode currNode = top;

        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public class StackNode {
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
