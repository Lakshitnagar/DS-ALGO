# P17 - Problem Statement
Given a binary tree, convert it to it's mirror form.
 
## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p17/S1.java) - Solution 1 (Recursive)
Idea is to first reach to leafs then swap nodes while tracking back up.
1. If root is null return.
2. Recursively call first left then right subtree.
3. After this swap left and right nodes.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
