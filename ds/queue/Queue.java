package ds.queue;

public class Queue {
    public QueueNode front;
    public QueueNode rear;

    public void enqueue(int data){
        QueueNode newNode = new QueueNode(data);

        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public QueueNode dequeue(){
        if(isEmpty()) return null;

        QueueNode dataNode = front;
        front = front.next;

        if(front==null) rear = null;

        return dataNode;
    }

    public boolean isEmpty(){
        if(front==null && rear==null) return true;

        return false;
    }

    public void printQueue(){
        QueueNode currNode = front;

        while (currNode!=null){
            System.out.println(currNode.data);

            currNode = currNode.next;
        }
    }

    public class QueueNode{
        public int data;
        public QueueNode next;

        public QueueNode(int data){
            this.data = data;
            this.next = null;
        }
    }
}
