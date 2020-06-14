# P3 - Problem Statement
Given a linked list, traverse the linked list and print data at `nth` position.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p3/S1.java) - Solution 1
1. Create a list linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements on to the linked list.
3. Traverse the linked list until `n` nodes passed or reached end.
4. Print the data at `nth` position if found else print "Linked list is short".

<b>Input</b> : 4
```
4
```
<b>Input</b> : 8
```
Linked list is short
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)                |
| Space         | O(1)                |