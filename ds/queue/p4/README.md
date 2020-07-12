# P4 - Problem Statement
Create a stack using two queues. Just need to perform push and pop.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/p4/S1.java) - Solution 1
1. Create 2 queues ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/Queue.java)), `q1` and `q2`.

(Make sure either of `q1` and `q2` must always empty)

2. For push operation just enqueue the item to the queue other than empty one.
3. For pop,\
    a. Transfer n-1 items from non-empty queue to empty queue.
    b. Return the last item left.
    c. If both are empty, throw err.

### Complexity

|               | Push          | Pop           |
| ------------- | ------------- | ------------- |
| Time          | O(1)          | O(n)          |
| Space         | O(1)          | -             |
