# P6 - Problem Statement
Given a binary tree, search an element in the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p6/S1.java) - Solution 1 (Recursive)
1. First compare with root value, if it is same return true.
2. Recursively search in left subtree.
3. If not found recursively search in right subtree.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p6/S2.java) - Solution 2 (Iterative)
We need an external queue for level order traversal.
1. While processing a node using [level order traversal](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p4/S1.java), compare it with value to search. If found return true.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
