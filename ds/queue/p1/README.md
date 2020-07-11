# P1 - Problem Statement
Create a queue and enqueue some data to it. After adding the data, try to dequeue first node.
While doing these operations print the whole stack after each operations.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/p1/S1.java) - Solution 1
1. Create a queue ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/queue/Queue.java)).
2. Push 7 elements on to the queue.
3. Print whole list.
```
1 -> FRONT
2
3
4
5
6
7 -> REAR
```
4. Dequeue 1<sup>st</sup> element.
5. Print the whole queue. 
```
2 -> FRONT
3
4
5
6
7 -> REAR
```

### Complexity

|               | Enqueue       | Dequeue       | Print         |
| ------------- | ------------- | ------------- | ------------- |
| Time          | O(1)          | O(1)          | O(n)          |
| Space         | O(1)          | -             | O(1)          |
