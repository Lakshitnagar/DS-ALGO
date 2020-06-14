package ds.linkedlist.p4;

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

        // Input
        int n = 2;

        LinkedList.LinkedListNode startNode = linkedList.head;
        LinkedList.LinkedListNode currNode = linkedList.head;
        int count = 1;

        if (n <= 0) return;

        while (true) {
            count = 1;

            while (count != n && currNode != null) {
                count++;
                currNode = currNode.next;
            }

            if (currNode == null) {
                System.out.println("Linked list is short");
                return;
            }

            if (currNode.next == null) {
                System.out.println(startNode.data);
                return;
            } else {
                startNode = startNode.next;
                currNode = startNode;

                if (startNode == null) return;
            }
        }
    }
}