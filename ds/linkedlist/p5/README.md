# P5 - Problem Statement
Given a linked list, check if it is cyclic or null terminated.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p5/S1.java) - Solution 1 (Floyd Cycle)
1. Create a list linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements on to the linked list. Make it cyclic.
3. Start with `slowNode` and `fastNode` as head.
4. Iterate `slowNode` by 1 step and `fastNode` by 2 steps.
5. If linked list is not cyclic then `fastNode` would end with null, else both nodes will meet.
6. check equality of `slowNode` and `fastNode` and print YES if both are same.

<b>Input</b> : If linked list is cyclic
```
YES
```
<b>Input</b> : If linked list is not cyclic
```
NO
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)                |
| Space         | O(1)                |