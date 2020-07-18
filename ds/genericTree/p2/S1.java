package ds.genericTree.p2;

import java.io.*;
import ds.genericTree.GenericTree;

public class S1 {

    public static void main(String args[]) {
        GenericTree genericTree = GenericTree.createCustomTree();

        System.out.println(findSum(genericTree.root));
    }

    public static int findSum(GenericTree.GenericTreeNode root){
        if(root==null) return 0;

        return root.data + findSum(root.firstChild) + findSum(root.nextSibling);
    }
}
