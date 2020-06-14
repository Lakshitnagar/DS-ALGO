package ds.linkedlist.p2;

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
        int data = 4;

        LinkedList.LinkedListNode currNode = linkedList.head;
        int count = 0;

        while (currNode != null) {
            if(currNode.data == data){
                System.out.println(count);
                break;
            } else {
                currNode = currNode.next;
                count++;
            }
        }

        if(currNode == null){
            System.out.println("Not Found");
        }
    }
}