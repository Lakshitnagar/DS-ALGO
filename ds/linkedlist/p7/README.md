# P7 - Problem Statement
Given two linked list (somehow linked in between like in below figure), find the merge point.

```
     L1 - - - - - - 
                     - - - - NULL
          L2 - - - -
```

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p7/S1.java) - Solution 1 (Length Difference)
1. Create two list linked lists L1, L2 ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 11 elements in L1 and 4 elements in L2. And link end of L2 to 8th node of L1.
3. Find length of L1 and L2 as `n` and `m`.
4. Take difference as `d = |n - m|`. 
5. Move `d` steps in long list.
6. Move 1 step at a time in both the lists.
6. Stop if node in both lists are same.

<b>Input</b> : L1 and L2
```
8
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(max(n, m))                |
| Space         | O(1)                |
