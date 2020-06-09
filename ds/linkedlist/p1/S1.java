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
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);

        // Printing data
        System.out.println("--- START ---");
        linkedList.printLinkedList();
        System.out.println("--- END ---");

        linkedList.delete(1);
        linkedList.delete(4);
        linkedList.delete(6);

        // Printing data
        System.out.println("--- START ---");
        linkedList.printLinkedList();
        System.out.println("--- END ---");
    }
}