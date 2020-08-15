# P12 - Problem Statement
`N` people have decided to elect a leader by arranging themselves in a circle and eliminating every `M`<sup>th</sup> person around the circle, closing ranks as each person drops out. Find which person will be last one remaining (with rank 1). 

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p12/S1.java) - Solution 1 (Iterative)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list. And make it circular.
3. Initialize `currNode` with head.
4. Iterate until `currNode` points to itself.
5. While iterating, move `M-1` steps and delete `M`<sup>th</sup> node.
6. Advance `currNode` to node next to deleted node.

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
 4
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(N*M)              |
| Space         | O(1)                |

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p12/S2.java) - Solution 2 (Recursive)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list. And make it circular.
```
josephus(n, k) = (josephus(n-1, k) + k-1)%n + 1
josephus(1, k) = 1
```

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
 4
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(N)              |
| Space         | O(N)                |
