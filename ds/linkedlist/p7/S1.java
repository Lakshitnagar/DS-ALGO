package ds.linkedlist.p7;

import java.io.*;

import ds.linkedlist.LinkedList;

public class S1 {

    public static void main(String args[]) {

        // Creation of Linked List
        LinkedList L1 = new LinkedList();
        LinkedList L2 = new LinkedList();

        // Populating data
        L1.insert(1);
        L1.insert(2);
        L1.insert(3);
        L1.insert(4);
        L1.insert(5);
        L1.insert(6);
        L1.insert(7);
        L1.insert(8);
        L1.insert(9);
        L1.insert(10);
        L1.insert(11);

        L2.insert(1);
        L2.insert(2);
        L2.insert(3);
        L2.insert(4);

        linkLinkedList(L1, L2, 8);

        int L1Length = 0;
        int L2Length = 0;
        LinkedList.LinkedListNode L1Head = L1.head;
        LinkedList.LinkedListNode L2Head = L2.head;

        while (L1Head != null) {
            L1Length++;
            L1Head = L1Head.next;
        }

        while (L2Head != null) {
            L2Length++;
            L2Head = L2Head.next;
        }

        int d;
        if (L1Length > L2Length) {
            d = L1Length - L2Length;
            L1Head = L1.head;
            L2Head = L2.head;
        } else {
            d = L2Length - L1Length;
            L1Head = L2.head;
            L2Head = L1.head;
        }

        for (int i = 0; i < d; i++) {
            L1Head = L1Head.next;
        }

        while(L1Head != L2Head){
            L1Head = L1Head.next;
            L2Head = L2Head.next;
        }

        System.out.println(L1Head.data);

//        L1.printLinkedList();
//        System.out.println("=================");
//        L2.printLinkedList();


        return;
    }

    static void linkLinkedList(LinkedList L1, LinkedList L2, int linkPoint) {
        getElement(L2, 4).next = getElement(L1, linkPoint);
    }

    static LinkedList.LinkedListNode getElement(LinkedList linkedList, int n) {

        LinkedList.LinkedListNode currNode = linkedList.head;
        int count = 1;

        if (n < 0) return null;

        while (currNode != null) {
            if (count == n) {
//                System.out.println(currNode.data);
                return currNode;
            } else {
                currNode = currNode.next;
                count++;
            }
        }

        if (currNode == null) {
            System.out.println("Linked list is short");
        }

        return null;
    }
}
