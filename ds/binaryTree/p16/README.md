# P16 - Problem Statement
Given a binary tree, check if it contains a root to leaf path with given sum.

This is same as printing root to leaf path.
*Important point here to note is return true as soon as sum found. Do not go further.*
 
## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p16/S1.java) - Solution 1 (Recursive)
To maintain the path create path array with size equal to height of the tree. Pass this array, given sum and initial `ind` 0 along with root of the tree.
1. If root is null return false.
2. Add this data to array at index `ind` and increment `ind` by one. (This is an important step to maintain path)
3. If it is a leaf node, sum all the elements of path array upto `ind` index.
4. If it matches to given sum, return true, else do nothing.
5. Else, recursively call function for left and right subtree with updated path array and `ind`.
    a. If any of the subtree return true, return true from there immediately.
    b. Else do nothing.
6. Return false.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
 
## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p16/S2.java) - Solution 2 (Recursive)
Another approach is to decrease the sum by data on current node while recursively calling function for left/right subtree.
1. If root is null return true if sum becomes zero, else return false.
2. Return OR of recursive version of left and right subtree with sum now lesser by data on the current node.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
