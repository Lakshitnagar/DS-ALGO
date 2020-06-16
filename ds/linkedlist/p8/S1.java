package ds.linkedlist.p8;

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
        linkedList.insert(8);
        linkedList.insert(9);
        linkedList.insert(10);
        linkedList.insert(11);

        LinkedList.LinkedListNode slowNode = linkedList.head;
        LinkedList.LinkedListNode fastNode = linkedList.head;

        while(fastNode.next!=null && fastNode.next.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        System.out.println(slowNode.data);

        return;
    }
}
