# P13 - Problem Statement
Given two binary trees, check if both are identical or not.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p13/S1.java) - Solution 1
1. If both root are null return true.
2. If either is null return false.
3. Else return if all three condition returns true.
    a. Data on root of both tree are same.
    b. Recursive call for both tree's left.
    c. Recursive call for both tree's right.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
