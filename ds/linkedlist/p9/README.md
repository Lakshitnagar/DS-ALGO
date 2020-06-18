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

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p9/S2.java) - Solution 2 (Recursive)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list.
3. Recursively reach the end of the linked list. This will create a call stack.
```
 NULL
  ^
| 7 |  -  node1 = recursion(node)
  ^
| 6 |  -  node
  ^
| 5 |
  ^
| 4 |
  ^
| 3 |
  ^
| 2 |
  ^
| 1 |
```
In above step, the recursion call must return node next to the node currently in called function.
5. Before tracking back change the head to the last node. For this you must pass linked list to the recursion function.
6. While tracing back, assign `node` as next of `node1`, and `NULL` as next of `node`. This will create something like below:
```
| 7 |            -  node1 = recursion(node)
 \,/
| 6 |->NULL      -  node
  ^
| 5 |
  ^
| 4 |
  ^
| 3 |
  ^
| 2 |
  ^
| 1 |
```
7. Now, return `node` as result of recursion function. So now list can be visualize as below.
```
| 7 |            
 \,/
| 6 |->NULL      -  node1 = recursion(node)
  ^
| 5 |            -  node
  ^
| 4 |
  ^
| 3 |
  ^
| 2 |
  ^
| 1 |
```
8. Repeat above for all nodes.

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
