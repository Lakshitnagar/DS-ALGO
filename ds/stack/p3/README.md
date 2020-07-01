# P3 - Problem Statement
Reverse a stack. Keeping in mind stack we don't know how stack is been implemented (Array or Linked list). We can only use push or pop functions.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p3/S1.java) - Solution 1
1. Create an empty stack ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/stack.java)).
2. Recursively pop all the elements from the stack.
3. While back tracking, use function `insertAtBottom` to insert the elements at the bottom od original stack.

<b>Input</b> :  
7 \
6 \
5 \
4 \
3 \
2 \
1 
``` 
1
2
3
4
5
6
7
```

### Complexity

|               | Symbol balanced |
| ------------- | --------------- |
| Time          | O(n<sup>2</sup>)            |
| Space         | O(n)            |
