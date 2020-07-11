# P8 - Problem Statement
Given an array, for every element find nearest greater element on right of that element.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p8/S1.java) - Solution 1
1. Initialize a stack with first element of the array.
2. For rest of the elements, mark current element's position as `nextGreaterPosition` and repeat #3 to #4.
3. While stack is not empty and value at `nextGreaterPosition` is greater than value at position `stack.top.data`\
    a. Pop from the stack.\
    b. For every popped element, `nextGreaterPosition` is the nearest greater on the right.
4. Push `nextGreaterPosition` to the stack.
5. At last the values remains in stack are the positions in the input array whose next greater value does not exists.

<b>Input</b> :  [6, 2, 5, 4, 5, 1, 6]

<b>Output</b> :
``` 
6 -> -1
2 ->  5
5 ->  6
4 ->  5
5 ->  6
1 ->  6
6 -> -1
```
note: -1 indicates NGE (Nearest Greater Element) does not exists.
### Complexity

|               | NGE             |
| ------------- | --------------- |
| Time          | O(n)            |
| Space         | O(n)            |
