package ds.linkedlist.p1;

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

        // Printing data
        linkedList.printLinkedList();
    }
}