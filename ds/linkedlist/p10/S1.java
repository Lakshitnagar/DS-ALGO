package ds.linkedlist.p10;

import java.io.*;

import ds.linkedlist.LinkedList;

public class S1 {

    public static void main(String args[]) {

        // Creation of Linked List
        LinkedList linkedList = new LinkedList();

        // Populating data
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);

//        linkedList.printLinkedList();

        LinkedList.LinkedListNode newHead = null;
        LinkedList.LinkedListNode prevNode = null;
        LinkedList.LinkedListNode tempNode = null;
        LinkedList.LinkedListNode currNode = linkedList.head;

        while (currNode != null && currNode.next != null) {
            if(tempNode == null) newHead = currNode.next;

            tempNode = currNode.next;
            currNode.next = currNode.next.next;
            tempNode.next = currNode;
            if(prevNode != null) prevNode.next = tempNode;

            prevNode = currNode;
            currNode = currNode.next;
        }

        linkedList.head = newHead;

        linkedList.printLinkedList();

        return;
    }
}
