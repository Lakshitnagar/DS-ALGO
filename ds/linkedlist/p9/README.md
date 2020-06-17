# P9 - Problem Statement
Given a linked list, reverse it from start to end. 

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p9/S1.java) - Solution 1 (Iterative)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list.
3. Start with `prevNode`, `currNode` and `nextNode` as null, head and head.next.
4. Re-point current node's next to point it's previous node. Assign `currNode.next` = `prevNode`.
5. Move all three nodes by 1 step. Assign<br> `prevNode` = `currNode`, <br> `currNode` = `nextNode`, <br> `nextNode` = `nextNode.next`.
6. Repeat #4 and #5 until `nextNode` is null.
7. Now it will leave last node as unlinked for rest like below:
```
NULL <- 1 <- 2 <- 3 <- 4 <- 5 <- 6   7 -> NULL
                                 P   C     N
```
So for final step, `currNode.next` = `prevNode` and `linkedList.head` = `currNode`.
8. Print final linked list.

<b>Input</b> : LinkedList
```
 1
 2
 3
 4
 5
 6
 7
```

<b>Output</b> : LinkedList
```
 7
 6
 5
 4
 3
 2
 1
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)              |
| Space         | O(1)                |
