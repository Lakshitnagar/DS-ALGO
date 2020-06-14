# P4 - Problem Statement
Given a linked list and print data at `nth` position from last.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p4/S1.java) - Solution 1 (Brute Force)
1. Create a list linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements on to the linked list.
3. Start with `startNode` and `currNode` as head.
4. Fix `startNode` and try to move `currNode` n times.
5. Stop above if either it completes n moves or `currNode` is null.
6. If #4 and #5 results in `currNode` as null then linked list is not big enough, we can terminate the program.
7. If #4 and #5 results in `currNode.next` as null then the `startNode` is what we are looking for. Print the data and terminate the program. 
8. If #6 and #7 are not true then reset `startNode` and `currNode` as `startNode.next`.
9. Repeat #5, #6 and #7 until `startNode` is null.

<b>Input</b> : 2
```
6
```
<b>Input</b> : 8
```
Linked list is short
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n<sup>2</sup>)                |
| Space         | O(1)                |