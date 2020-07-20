# P7 - Problem Statement
Given a binary tree, insert an element into the tree.

Since, it is a binary tree, the position of element don't really matter. Just insert element where ever first vacancy available.
## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p7/S1.java) - Solution 1
To traverse in level, we need queue to store every node at same level.
1. Initiate queue with root node.
2. Until queue is not empty, repeat #3 to #4.
3. Dequeue from queue, if either left or right child not available insert there and return.
4. If no vacancy, enqueue all the available nodes to the queue. 

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
