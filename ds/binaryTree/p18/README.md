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

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p18/S1.java) - Solution 2 (Iterative)
The idea is to do pre-order traversal and keep track of root to processing node path. For this we pop from stack only when left and right child of a node is processed.
1. In addition to pre-order, push one null if only left child is processed, push two nulls if both children processed. 
2. Move to right child if left is processed.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
