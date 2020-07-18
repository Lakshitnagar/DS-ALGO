package ds.genericTree;

public class GenericTree {
    public GenericTreeNode root;

    public static class GenericTreeNode {
        public int data;
        public GenericTreeNode firstChild;
        public GenericTreeNode nextSibling;

        public GenericTreeNode(int data) {
            this.data = data;
            this.firstChild = null;
            this.nextSibling = null;
        }
    }

    public static GenericTreeNode createNode(int data){
        return new GenericTreeNode(data);
    }

    public static GenericTree createCustomTree(){
        // Creation of Generic Tree
        GenericTree genericTree = new GenericTree();

        // Populating data
        GenericTreeNode node1 = createNode(1);
        GenericTreeNode node2 = createNode(2);
        GenericTreeNode node3 = createNode(3);
        GenericTreeNode node4 = createNode(4);
        GenericTreeNode node5 = createNode(5);
        GenericTreeNode node6 = createNode(6);
        GenericTreeNode node7 = createNode(7);
        GenericTreeNode node8 = createNode(8);
        GenericTreeNode node9 = createNode(9);
        GenericTreeNode node10 = createNode(10);
        GenericTreeNode node11 = createNode(11);

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
