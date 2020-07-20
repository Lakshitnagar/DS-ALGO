# P11 - Problem Statement
Given a binary tree, find the deepest node in the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p11/S1.java) - Solution 1
Idea is the last element in level order traversal is the deepest node in the tree. To traverse in level, we need queue.
1. Initiate queue with root node.
2. Until queue is not empty, repeat #3 to #4.
3. Dequeue from queue, and store is temp node.
4. Enqueue all the available nodes to the queue (but first right and then left). 
5. Return temp node.

Important note:
- Last element in level order traversal is the deepest node in a BT.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
