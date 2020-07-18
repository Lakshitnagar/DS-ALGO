# Generic Tree
Generic tree is like a linked list but with many branches. To create N-ary tree we have to reserve N child nodes in each node.

![alt text](https://upload.wikimedia.org/wikipedia/en/b/b8/Karytree.png)

Assigning m child pointers to each node is just not optimized. Instead we can achieve it by using only two pointers in each nodes,
`firstChild` and `nextSibling`.

![alt text](https://media.geeksforgeeks.org/wp-content/uploads/new.jpeg)

So it degenerates to Binary Tree.

##### Application
1. Making a directories.
2. Not very practical. Actually it is a Binary tree in disguise.

##### Implementation
* Linked List (most used implementation)

## Questions
[00](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/genericTree/GenericTree.java) - Implement GenericTree using Java class.\
[p1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/genericTree/p1) - Create a generic tree with some data.\
[p2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/genericTree/p2) - Find sum of all nodes.
