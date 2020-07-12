# P3 - Problem Statement
Create a queue using two stacks. Just need to perform enqueue and dequeue.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/p3/S1.java) - Solution 1
1. Create 2 stacks ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/Stack.java)), `s1` and `s2`.

(Make sure `s1` is always for enqueue and `s2` is always for dequeue)

2. For enqueue operation just push the item on `s1`.
3. For dequeue,\
    a. If `s2` is non-empty, pop from it and return.
    b. If `s2` is empty, transfer all elements from `s1` to `s2` and then pop from `s2`.
    c. If `s1` is also empty throw err.

### Complexity

|               | Enqueue       | Dequeue       |
| ------------- | ------------- | ------------- |
| Time          | O(1)          | O(1) Amortized |
| Space         | O(1)          | -             |
