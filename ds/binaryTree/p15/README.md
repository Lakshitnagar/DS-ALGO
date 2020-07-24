# P15 - Problem Statement
Given a binary tree, print all possible root to leaf paths.

This is best solved by recursion. Recursion really shines here. Since we can have memory of previous node in recursion, we can maintain the path it follows.
## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p15/S1.java) - Solution 1 (Recursive)
To maintain the path create path array with size equal to height of the tree. Pass this array and initial `ind` 0 along with root of the tree.
1. If root is null return.
2. Add this data to array at index `ind` and increment `ind` by one. (This is an important step to maintain path)
3. If it is a leaf node, print the path array upto `ind` index.
4. Else, recursively call function for left and right subtree with updated path array and `ind`.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
