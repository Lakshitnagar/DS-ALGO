package ds.binaryTree;

import ds.binaryTree.BinaryTree;

public class QueueBT {
    public QueueNodeBT front;
    public QueueNodeBT rear;
    public int size = 0;

    public void enqueue(BinaryTree.BinaryTreeNode data){
        QueueNodeBT newNode = new QueueNodeBT(data);

        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public QueueNodeBT dequeue(){
        if(isEmpty()) return null;

        QueueNodeBT dataNode = front;
        front = front.next;

        if(front==null) rear = null;

        size--;

        return dataNode;
    }

    public boolean isEmpty(){
        if(front==null && rear==null) return true;

        return false;
    }

    public void printQueue(){
        QueueNodeBT currNode = front;

        while (currNode!=null){
            System.out.println(currNode.data.data);

            currNode = currNode.next;
        }
    }

    public class QueueNodeBT{
        public BinaryTree.BinaryTreeNode data;
        public QueueNodeBT next;

        public QueueNodeBT(BinaryTree.BinaryTreeNode data){
            this.data = data;
            this.next = null;
        }
    }
}
