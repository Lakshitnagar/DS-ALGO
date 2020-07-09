# P5 - Problem Statement
<b>Increasing stack</b> : A stack whose next push value always greater than the top value.

Verify the below property of increasing stack.\
<b>Property</b> : <i>For an array, increasing stack can keep track of the first smaller on its left and right?</i>

Reference : https://stackoverflow.com/questions/4311694/maximize-the-rectangular-area-under-histogram

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p5/S1.java) - Solution 1
1. Append and prepend lowest of all in the input array and name it as processed array.
```
[-1, 10, 4, 5, 90, 1, 80, -1]
```
2. Create an empty stack.
3. For every element in new processed array repeat #4 to #5.
4. While stack is not empty and current value in iteration is less than the value at position given stack's top.\
    a. Pop out the stack. This value is our middle value of interest whose left and right we have to find.\
    b. Top of the stack will be our left value.\
    c. current iteration which popped from the stack in 4.a is our right value.\
    d. Since, we have processed array, all our values in above 3 steps will be 1 lower.
5. Push current iteration index.

<b>Input</b> :  [10, 4, 5, 90, 1, 80]

<b>Output</b> :
``` 
[-1, 1]
[-1, 4]
[1, 4]
[2, 4]
[-1, 6]
[4, 6]
```
note: -1 indicates index of left out of bound and 6 indicates index of right out of bound

### Complexity

|               | Increasing stack|
| ------------- | --------------- |
| Time          | O(n)            |
| Space         | O(n)            |
