# P14 - Problem Statement
Given a binary tree, find the diameter of the tree.

Diameter is the longest path between 2 leaf nodes (including leaf nodes).\
The idea is that diameter is nothing but the height of subtrees. So there are 3 possibilities:
- The longest path passes through the root.\
    In this case we can just find the height of both sub-tree, add them and plus 1 for the root.
- The longest path is all in left sub-tree.
    In this case we can treat this sub-tree as new problem and try to find it's diameter.
- The longest path is all in right sub-tree.
    In this case we can treat this sub-tree as new problem and try to find it's diameter.

At last the answer would be max among all thee cases.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p14/S1.java) - Solution 1 (Recursive)
1. If both root are null return 0.
2. Find height of left and right subtree.
3. Recursively find diameter of left and right subtree.
4. Get max as : `MAX(leftHeight+rightHeight+1, MAX(leftDiameter, rightDiameter))`

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
