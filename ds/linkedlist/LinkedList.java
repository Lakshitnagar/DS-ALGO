package ds.linkedlist;

public class LinkedList {

    // default head to be null
    public LinkedListNode head;

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

    public void delete(int d) {
        LinkedListNode node = new LinkedListNode(d);

        if (this.head == null) {
            System.out.println("List is Empty. Nothing to delete");
            return;
        } else {
            if(this.head.data == d) {
                LinkedListNode temp = this.head;
                this.head = this.head.next;
                temp = null;
                System.out.println(d + " deleted");

                return;
            }

            LinkedListNode prev = null;
            LinkedListNode curr = this.head;

            while(curr != null && curr.data != d){
                prev = curr;
                curr = curr.next;
            }

            if(curr == null){
                System.out.println(d + " not found");
            } else {
                prev.next = curr.next;
                curr = null;
                System.out.println(d + " deleted");
            }
        }

        return;
    }

    public void printLinkedList() {
        LinkedListNode printNode = this.head;

        while (printNode != null) {
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
    }

    public class LinkedListNode {
        public int data;
        public LinkedListNode next;

        LinkedListNode(int d) {
            data = d;
            next = null;
        }
    }
}