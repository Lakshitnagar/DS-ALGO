# P2 - Problem Statement
Given a queue, reverse it's content recursively.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/p2/S1.java) - Solution 1
1. Create a queue ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/Queue.java)).
2. Push 7 elements on to the queue.
3. Dequeue data and save in `data`.
4. Recursively call own function till queue is empty.
5. Enqueue `data` to the queue.

### Complexity

|               | Reverse       |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
