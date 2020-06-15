package ds.linkedlist.p6;

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

        makeCyclic(linkedList, 7, 3);

        LinkedList.LinkedListNode slowNode = linkedList.head;
        LinkedList.LinkedListNode fastNode = linkedList.head;

        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (slowNode == fastNode) {
                System.out.println("YES");
                slowNode = linkedList.head;

                while (slowNode != fastNode) {
                    slowNode = slowNode.next;
                    fastNode = fastNode.next;
                    if(slowNode == fastNode){
                        System.out.println(slowNode.data);
                        break;
                    }
                }

                return;
            }
        }

        System.out.println("NO");
        return;
    }

    static void makeCyclic(LinkedList linkedList, int listSize, int cyclePosition) {
        getElement(linkedList, listSize).next = getElement(linkedList, cyclePosition);
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
