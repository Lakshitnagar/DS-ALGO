# P12 - Problem Statement
Given a binary tree, delete a node in the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p12/S1.java) - Solution 1
1. Find the node which we want to delete.
2. Find the deepest node in the tree.
3. Replace content of #1 with #2.
4. Delete #2.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
