package ds.linkedlist;

public class LinkedList {

    // default head to be null
    LinkedListNode head;

    // function to insert data in to linked list
    // Using this for the instance which call this function
    public void insert(int d) {
        LinkedListNode node = new LinkedListNode(d);

        if (this.head == null) {
            this.head = node;
        } else {
            LinkedListNode last = this.head;

            while(last.next != null){
                last = last.next;
            }

            last.next = node;
        }
    }

    public void printLinkedList() {
        LinkedListNode printNode = this.head;

        while (printNode != null) {
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
    }

    class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int d) {
            data = d;
            next = null;
        }
    }
}