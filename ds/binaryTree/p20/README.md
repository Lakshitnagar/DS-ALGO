# P20 - Problem Statement
Given a binary tree, traverse in level order in zigzag manner.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p20/S1.java) - Solution 1 (Iterative)
To traverse in zigzag level, we need two stacks `currLevel` and `nextLevel`.
1. Initiate `currLevel` with root value.
2. Start a loop and repeat #3 to #6 until `currLevel` is empty.
3. Pop from `currLevel`. If non null do #4 to #6.
4. Process the node.
5. If `leftToRight` is true first push left child and then right child else opposite to `nextLevel`.
6. **If `currLevel` is empty swap it with `nextLevel`.**

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
