# P10 - Problem Statement
Given a linked list, reverse it's elements in pairs. 

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p10/S1.java) - Solution 1 (Iterative)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list.
3. Start with `newHead`, `prevNode`, `tempNode` and `currNode = head`.
4. Iterate until `currNode` and it's next exists.
5. While iterating use `tempNode` to swap `currNode` and `currNode->next`. Use `prevNode` to store reference to `currNode` for next iteration.
6. For first iteration store `tempNode` to `newHead`.
7. After iteration return `newHead` and exit. 

<b>Input</b> : LinkedList
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
 2
 1
 4
 3
 6
 5
 7
```

## [S2](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/p10/S2.java) - Solution 2 (Recursive)
1. Create a linked list ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/linkedlist/LinkedList.java)).
2. Insert 7 elements in the linked list.
3. Reverse first pair of linked list.
4. Recursively call function for rest of the linked list.

<b>Input</b> : LinkedList
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
 2
 1
 4
 3
 6
 5
 7
```

### Complexity

|               | Find an element     |
| ------------- | ------------------- |
| Time          | O(n)              |
| Space         | O(1)                |
