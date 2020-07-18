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
}
