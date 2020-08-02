# P21 - Problem Statement
Given a binary tree, calculate the max width of the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p21/S1.java) - Solution 1 (Iterative)
Same as calculating the [height of BT](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p10/S2.java), instead of maintaining height we can track no. of nodes in a particular level and it's max value across all levels.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
