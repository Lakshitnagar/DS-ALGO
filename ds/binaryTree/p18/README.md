# P18 - Problem Statement
Given a binary tree, print root to node path.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p18/S1.java) - Solution 1 (Recursive)
The idea is to first reach the node and then while tracking back fill the path array.
1. If root is null return false.
2. Increase `ind` by one.
3. Check OR between root data, recursive call to left and right subtree.
4. If #3 turns valid add the root value to path array at `ind` value. Return true.
5. Else, Return false.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
