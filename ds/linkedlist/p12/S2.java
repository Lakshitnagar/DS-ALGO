package ds.linkedlist.p12;

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

        makeListCircular(linkedList);

        int M = 3;
        int rankPos;
        rankPos = josephus(linkedList.length, M);

        System.out.println(getKthNode(linkedList.head, rankPos));

        return;
    }

    static int josephus(int n, int k){
        if(n==1) return 1;
        else return (josephus(n-1, k) + k-1)%n + 1;
    }

    static void makeListCircular(LinkedList linkedList) {
        LinkedList.LinkedListNode currNode = linkedList.head;

        if (currNode == null) return;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = linkedList.head;
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
