# P1 - Problem Statement
Create a stack and push some data to it. After pushing the data, try to pop first node.
While doing these operations print the whole stack after each operations.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p1/S1.java) - Solution 1
1. Create a stack ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/Stack.java)).
2. Push 7 elements on to the stack.
3. Print whole list.
```
7
6
5
4
3
2
1
```
4. Pop 1<sup>st</sup> element.
5. Print the whole stack. 
```
6
5
4
3
2
1
```

### Complexity

|               | Push          | Pop           | Print         |
| ------------- | ------------- | ------------- | ------------- |
| Time          | O(1)          | O(1)          | O(n)          |
| Space         | O(1)          | -             | O(1)          |
