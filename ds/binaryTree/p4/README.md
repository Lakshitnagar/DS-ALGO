# P4 - Problem Statement
Given a binary tree, traverse the tree in level-order fashion and print data alongside.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p4/S1.java) - Solution 1 (Iterative)
To traverse in level, we need queue to store every node at same level.
1. Initiate queue with root node.
2. Until queue is not empty, repeat #3 to #4.
3. Dequeue from queue, process this node.
4. Enqueue all the available nodes to the queue. 

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
