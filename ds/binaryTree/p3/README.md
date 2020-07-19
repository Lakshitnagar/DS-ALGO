# P3 - Problem Statement
Given a binary tree, traverse the tree in post-order fashion and print data alongside.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p3/S1.java) - Solution 1 (Recursive)
1. In a recursion, keep a null check.
2. Recursively call for left subtree.
3. Recursively call for right subtree.
4. Process current node.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/binaryTree/p3/S2.java) - Solution 2 (Iterative)
Post order traversal in different from pre- and in-order. In pre/in-order we do not visit the node again. But in post-order after left subtree we visit current but not process it. It is the second time, after visiting right subtree, we process the current node.

For this we need `prevNode` to keep track of whether we are going down the tree or coming up the tree.
1. Push root to stack.
2. Until stack is not empty repeat #3 to #7.
3. Initialise `currNode` with top of stack (do not pop stack).
4. If `prevNode` is null or if it is a parent of `currNode` then push first left child of `currNode` or right if left not available or process `currNode` if no child and pop one from stack.
5. If `prevNode` is left child of `currNode`, push right child if available or process `currNode` if not available and pop one from stack.
6. If `prevNode` is right child of `currNode`, process `currNode` and pop one from stack.
7. Assign `currNode` to `prevNode`.

Repeat above until stack in empty.

### Complexity

|               | Traversal     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
