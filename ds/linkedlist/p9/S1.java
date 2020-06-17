package ds.linkedlist.p9;

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

        LinkedList.LinkedListNode prevNode = null;
        LinkedList.LinkedListNode currNode = linkedList.head;
        LinkedList.LinkedListNode nextNode = linkedList.head.next;

        while(nextNode != null){
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }

        currNode.next = prevNode;
        linkedList.head = currNode;

        linkedList.printLinkedList();

        return;
    }
}
