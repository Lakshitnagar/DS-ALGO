# P8 - Problem Statement
Given a binary tree, find height of the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p10/S1.java) - Solution 1 (Recursive)
1. If root is null return 0.
2. Recursively find height for left subtree.
3. Recursively find height for right subtree.
4. Resultant height will be max of #3 and #4 plus 1.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p10/S2.java) - Solution 2 (Iterative)
We need an external queue for level order traversal. NULL entry will be a demarcation of the level.
1. Initialise a height with 0, a queue with root node and null node.
2. While processing a node using [level order traversal](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p4/S1.java), increase height by 1 and enqueue NULL if queue is not empty.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
