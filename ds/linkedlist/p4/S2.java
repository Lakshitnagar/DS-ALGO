package ds.linkedlist.p4;

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

        // Input
        int n = 0;

        LinkedList.LinkedListNode startNode = linkedList.head;
        LinkedList.LinkedListNode currNode = linkedList.head;
        int count = 1;

        if (n <= 0) return;

        while (currNode != null) {
            if(count < n){
                count++;
                currNode = currNode.next;
            } else {
                if(currNode.next != null){
                    startNode = startNode.next;
                    currNode = currNode.next;
                } else {
                    break;
                }
            }
        }

        if (currNode == null) {
            System.out.println("Linked list is short");
        } else {
            System.out.println(startNode.data);
        }

        return;
    }
}