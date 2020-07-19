# P2 - Problem Statement
Given a binary tree, traverse the tree in in-order fashion and print data alongside.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p2/S1.java) - Solution 1 (Recursive)
1. In a recursion, keep a null check.
2. Recursively call for left subtree.
3. Process current node.
4. Recursively call for right subtree.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p2/S2.java) - Solution 2 (Iterative)
We need an external stack for it.
1. Push current to stack and move to left.
2. When you consume all left, pop from stack, process it and move to right.

Repeat above until stack in empty.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
