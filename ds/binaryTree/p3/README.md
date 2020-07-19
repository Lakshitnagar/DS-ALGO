# P2 - Problem Statement
Given a binary tree, traverse the tree in post-order fashion and print data alongside.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p3/S1.java) - Solution 1 (Recursive)
1. In a recursion, keep a null check.
2. Recursively call for left subtree.
3. Recursively call for right subtree.
4. Process current node.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p3/S2.java) - Solution 2 (Iterative)
Post order traversal in different from pre- and in-order. In pre/in-order we do not visit the node again. But in post-order after left subtree we visit current but not process it. It is the second time, after visiting right subtree, we process the current node.

For this we need `prevNode` to keep track of whether we are going down the tree or coming up the tree.
1. Push current to stack and move to left.
2. When you consume all left, pop from stack, process it and move to right.

Repeat above until stack in empty.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
