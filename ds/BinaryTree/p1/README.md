# P1 - Problem Statement
Given a binary tree, traverse the tree in pre-order fashion and print data alongside.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p1/S1.java) - Solution 1 (Recursive)
1. In a recursion, keep a null check.
2. Process current node.
3. Recursively call for left subtree.
3. Recursively call for right subtree.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p1/S1.java) - Solution 1 (Iterative)
We need an external stack for it.
1. Process current, push it to stack and move to left.
2. When you consume all left, pop from stack and move to right.

Repeat above until stack in empty.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
