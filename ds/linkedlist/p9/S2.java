package ds.linkedlist.p9;

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

        reverseRecursively(linkedList, linkedList.head);

        linkedList.printLinkedList();

        return;
    }

    static LinkedList.LinkedListNode reverseRecursively(LinkedList linkedList, LinkedList.LinkedListNode node){
        if(node == null) return null;
        if(node.next == null) {
            linkedList.head = node;
            return node;
        }

        LinkedList.LinkedListNode node1 = reverseRecursively(linkedList, node.next);

        node1.next = node;
        node.next = null;

        return node;
    }
}
