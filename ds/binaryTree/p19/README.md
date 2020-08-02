# P19 - Problem Statement
Given a binary tree, find LCA (Least Common Ancestor). LCA is closest parent node which 2 nodes shares.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p19/S1.java) - Solution 1 (Root to node path intersection)
We will use [Root to node path](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p18/S1.java)
1. Find root to node1 path as `path1`.
2. Find root to node2 path as `path2`.
3. From `path1` and `path2` find the intersection.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p19/S2.java) - Solution 2 (Single traversal - recursive)
1. If root is null return null
2. If root data is equal to either nodes, return root.
3. Recursively call and save for left and right subtree.
4. If result of both subtree are non null, return root.
5. Else return which is non null.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S3](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p19/S3.java) - Solution 3 (Single traversal - iterative)
We will use modification to [Root to node path](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p18/S3.java)
1. Assign LCA first match.
2. Change LCA again only which it itself popped out of stack with next value in stack.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
