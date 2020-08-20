# P2 - Problem Statement
Given a BST insert an element in it.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/p2/S1.java) - Solution 1 (Recursive)
1. If root is null, assign new node to it.
2. If data is less than root data, assign root's left subtree as recursive all with left subtree.
3. If data is greater than root data, assign root's right subtree as recursive all with right subtree.
4. Return root.

_Note: Disadvantage of this is that it updates all the nodes it encounters._

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binarySearchTree/p2/S2.java) - Solution 2 (Iterative)
1. Start a while loop and continue until reach at leaves.
2. If root value matches return immediately.
3. Depending on root value move to either left or right subtree.\
    a. If it is left subtree and it is null assign new node here and return.\
    b. If it is right subtree and it is null assign new node here and return.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(1)          |
