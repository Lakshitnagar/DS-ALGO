# P8 - Problem Statement
Given a binary tree, find size of the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p8/S1.java) - Solution 1 (Recursive)
1. If root is null return 0.
2. Recursively find size for left subtree.
3. Plus 1 for root node of the tree.
4. Recursively find size for right subtree.
5. Add and return #2, #3, #4.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p8/S2.java) - Solution 2 (Iterative)
We need an external queue for level order traversal.
1. Initialise a size with 0.
2. While processing a node using [level order traversal](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p4/S1.java), increase size by 1.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
