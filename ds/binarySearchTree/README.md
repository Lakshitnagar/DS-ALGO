# Binary Search Tree
Binary Search Tree is like a Binary Tree but with following restriction:
1. For any node, nodes in left sub tree contains data lesser than the node.
2. For any node, nodes in right sub tree contains data greater than the node.
3. Both left and right sub tree must also Binary Search Tree.

![alt text](https://media.geeksforgeeks.org/wp-content/uploads/BSTSearch.png)

##### Application
1. Mostly for searching in O(log(n)) in worst case.
2. BST used in Unix kernels for managing a set of virtual memory areas (VMAs).
3. It is used to implement dictionary.
4. To solve database problem such as indexing.

##### Implementation
* Linked List (most used implementation)

##### Important note while solving problems on BST
1. For searching consider either left or right sub-tree not both.
2. For processing, first process left subtree, then root and then right sub-tree. Mostly middle step changes that is processing of root. We do not touch first and third step.
3. For processing in sorted order, go for in-order traversal.

## Questions
[00](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/BinarySearchTree.java) - Implement BinarySearchTree using Java class.\
[p1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/p1) - Print BST in sorted order.\
[p2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/p2) - Insert an element in BST.\
[p3](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/p3) - Find min and max elements in a BST.\
[p4](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/p4) - Find an element in a BST.
