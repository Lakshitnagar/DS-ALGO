package ds.genericTree;

public class GenericTree {
    public GenericTree root;

    public class GenericTreeNode {
        int data;
        GenericTree firstChild;
        GenericTree nextSibling;

        GenericTree(int data) {
            this.data = data;
            this.firstChild = null;
            this.nextSibling = null;
        }
    }
}
