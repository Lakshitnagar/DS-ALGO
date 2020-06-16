# P7 - Problem Statement
Given a linked list, find mid point of the linked list.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p7/S1.java) - Solution 1 (Slow and Fast Nodes)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 11 elements in the linked list.
3. Start with `slowNode` and `fastNode` as head.
4. Iterate `slowNode` by 1 step and `fastNode` by 2 steps, until `fastNode` reaches the end.
5. Point where `fastNode` reaches the end, `slowNode` will reach in mid.
6. Print `slowNode`

<b>Input</b> : LinkedList
```
6
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)                |
| Space         | O(1)                |
