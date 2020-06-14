# P2 - Problem Statement
Given a linked list and `data` to find, traverse the linked list and print the position of the that `data` if found.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p2/S1.java) - Solution 1
1. Create a list linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements on to the linked list.
3. Print whole list.
```
1
2
3
4
5
6
7
```
4. Traverse the linked list until `data` is found or reached end.
5. Print the position of `data` if found else print "Not Found".

<b>Input</b> : 4
```
3
```
<b>Input</b> : 8
```
Not Found
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)                |
| Space         | O(1)                |