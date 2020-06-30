package ds.linkedlist.p11;

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

        // Group length
        int k = 3;

        // Similar to problem 9 (p9)
        LinkedList.LinkedListNode prevNode = null;
        LinkedList.LinkedListNode currNode = linkedList.head;
        LinkedList.LinkedListNode nextNode = currNode.next;

        // Keeping track of last element of previous group
        LinkedList.LinkedListNode prevGroupNode = null;

        LinkedList.LinkedListNode newHead = getKthNode(linkedList.head, k);

        while (currNode != null && hasKNodes(currNode, k)) {
            prevGroupNode = currNode;

            for (int i = 1; i <= k; i++) {
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
                if (nextNode != null) nextNode = nextNode.next;
            }

            // Assigning end of previous group to future end of next group
            prevGroupNode.next = getKthNode(currNode, k);
        }

        // For remaining list
        if (prevGroupNode != null) prevGroupNode.next = currNode;

        // Updating new head
        if (newHead != null) linkedList.head = newHead;

        linkedList.printLinkedList();

        return;
    }

    static boolean hasKNodes(LinkedList.LinkedListNode node, int k) {
        if (node == null) return false;

        LinkedList.LinkedListNode currNode = node;
        int c = 1;

        while (c < k && currNode.next != null) {
            currNode = currNode.next;
            c++;
        }

        if (c == k) return true;
        else return false;
    }

    static LinkedList.LinkedListNode getKthNode(LinkedList.LinkedListNode node, int k) {
        if (node == null) return null;

        LinkedList.LinkedListNode currNode = node;
        int c = 1;

        while (c < k && currNode.next != null) {
            currNode = currNode.next;
            c++;
        }

        if (c == k) return currNode;
        else return null;
    }
}
