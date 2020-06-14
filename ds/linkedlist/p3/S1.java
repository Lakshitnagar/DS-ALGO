package ds.linkedlist.p3;

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
        int n = 4;

        LinkedList.LinkedListNode currNode = linkedList.head;
        int count = 0;

        if (n < 0) return;

        while (currNode != null) {
            if (count == n) {
                System.out.println(currNode.data);
                break;
            } else {
                currNode = currNode.next;
                count++;
            }
        }

        if (currNode == null) {
            System.out.println("Linked list is short");
        }
    }
}