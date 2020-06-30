package ds.linkedlist.p12;

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

        makeListCircular(linkedList);

        int M = 3;

        LinkedList.LinkedListNode currNode = linkedList.head;
        while (currNode != currNode.next) {
            LinkedList.LinkedListNode tempNode = null;

            for (int i = 1; i < M-1; i++) {
                currNode = currNode.next;
            }

            tempNode = currNode.next;
            currNode.next = currNode.next.next;

            tempNode = null;

            currNode = currNode.next;
        }

        System.out.println(currNode.data);

        return;
    }

    static void makeListCircular(LinkedList linkedList) {
        LinkedList.LinkedListNode currNode = linkedList.head;

        if (currNode == null) return;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = linkedList.head;
    }
}
