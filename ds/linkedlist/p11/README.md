# P11 - Problem Statement
Given a linked list, reverse it's elements in group of `k` elements. 

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p11/S1.java) - Solution 1 (Iterative)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list.
3. We need two utility functions `hasKNodes`(given node and `k` return boolean flag) and `getKthNode` (given node and `k` return node at `k`<sup>th</sup> place).
4. Reverse first `k` elements as per [problem 9](https://github.com/Lakshitnagar/DS-ALGO/tree/master/ds/linkedlist/p9).
5. Important to remember that first node in a group before reversing, will be the previous element of next group's last element after reversing.
6. Attach remaining list if available.

<b>Input</b> : LinkedList and `k` is 3
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
 3
 2
 1
 6
 5
 4
 7
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)              |
| Space         | O(1)                |
