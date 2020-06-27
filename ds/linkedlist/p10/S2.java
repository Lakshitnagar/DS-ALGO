package ds.linkedlist.p10;

import java.io.*;

import ds.linkedlist.LinkedList;

public class S2 {

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

        reversePairRecursively(linkedList, linkedList.head, null);

        linkedList.printLinkedList();

        return;
    }

    static LinkedList.LinkedListNode tempNode = null;

    static void reversePairRecursively(LinkedList linkedList, LinkedList.LinkedListNode headNode, LinkedList.LinkedListNode prevNode){
        if(headNode == null || headNode.next == null ) return;

        // Update head
        if(tempNode == null) linkedList.head = headNode.next;

        // Reverse first pair
        tempNode = headNode.next;
        headNode.next = headNode.next.next;
        tempNode.next = headNode;

        // Link to prev
        if(prevNode != null) prevNode.next = tempNode;

        // Reverse rest of the list
        reversePairRecursively(linkedList, headNode.next, headNode);
    }
}
