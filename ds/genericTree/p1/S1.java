package ds.genericTree.p1;

import java.io.*;
import ds.genericTree.GenericTree;

public class S1 {

    public static void main(String args[]) {
        System.out.println(createCustomTree().root.data); // 1
        System.out.println(createCustomTree().root.firstChild.data); // 2
        System.out.println(createCustomTree().root.firstChild.nextSibling.data); // 3
        System.out.println(createCustomTree().root.firstChild.nextSibling.nextSibling.data); // 4
        System.out.println(createCustomTree().root.firstChild.nextSibling.nextSibling.nextSibling.data); // 5

        System.out.println(createCustomTree().root.firstChild.firstChild.data); // 6
        System.out.println(createCustomTree().root.firstChild.firstChild.nextSibling.data); // 7

        System.out.println(createCustomTree().root.firstChild.nextSibling.firstChild.data); // 8

        System.out.println(createCustomTree().root.firstChild.nextSibling.nextSibling.nextSibling.firstChild.data); // 9
        System.out.println(createCustomTree().root.firstChild.nextSibling.nextSibling.nextSibling.firstChild.nextSibling.data); // 10
        System.out.println(createCustomTree().root.firstChild.nextSibling.nextSibling.nextSibling.firstChild.nextSibling.nextSibling.data); // 11
    }

    public static GenericTree createCustomTree(){
        // Creation of Generic Tree
        GenericTree genericTree = new GenericTree();

        // Populating data
        GenericTree.GenericTreeNode node1 = GenericTree.createNode(1);
        GenericTree.GenericTreeNode node2 = GenericTree.createNode(2);
        GenericTree.GenericTreeNode node3 = GenericTree.createNode(3);
        GenericTree.GenericTreeNode node4 = GenericTree.createNode(4);
        GenericTree.GenericTreeNode node5 = GenericTree.createNode(5);
        GenericTree.GenericTreeNode node6 = GenericTree.createNode(6);
        GenericTree.GenericTreeNode node7 = GenericTree.createNode(7);
        GenericTree.GenericTreeNode node8 = GenericTree.createNode(8);
        GenericTree.GenericTreeNode node9 = GenericTree.createNode(9);
        GenericTree.GenericTreeNode node10 = GenericTree.createNode(10);
        GenericTree.GenericTreeNode node11 = GenericTree.createNode(11);

        node6.nextSibling = node7;

        node9.nextSibling = node10;
        node10.nextSibling = node11;

        node5.firstChild = node9;
        node3.firstChild = node8;
        node2.firstChild = node6;

        node2.nextSibling = node3;
        node3.nextSibling = node4;
        node4.nextSibling = node5;

        node1.firstChild = node2;

        genericTree.root = node1;

        return genericTree;
    }
}
