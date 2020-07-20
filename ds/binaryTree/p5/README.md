# P5 - Problem Statement
Given a binary tree, find maximum element in the tree.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p5/S1.java) - Solution 1 (Recursive)
1. Get root value.
2. Recursively get max value in left subtree.
3. Recursively get max value in right subtree.
4. Find max among all three.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p5/S2.java) - Solution 2 (Iterative)
We need an external queue for level order traversal.
1. Initiate a max value as lowest possible value.
2. While processing a node using [level order traversal](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p4/S1.java), compare it with max value and change max accordingly.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
