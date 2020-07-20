# P9 - Problem Statement
Given a binary tree, traverse in reverse level order.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p9/S1.java) - Solution 1
To traverse in level, we need queue and to reverse it we need stack.
1. Initiate queue with root node.
2. Until queue is not empty, repeat #3 to #4.
3. Dequeue from queue, and push it to a stack.
4. Enqueue all the available nodes to the queue (but first right and then left). 
5. Now print the stack.

Important note:
- Enqueuing right child first, reverses the level order horizontally.
- Pushing to stack instead of processing it, reverses the level order both horizontally and vertically. 

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
