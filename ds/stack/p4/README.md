# P4 - Problem Statement
Given an array A, find the span S[i] of A[i], that is the maximum number of consecutive elements A[j] immediately preceding A[i] and such that A[j]<=A[i].\
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/Stock_span.png)\
This is a very common problem in stock markets to find the peaks.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p4/S1.java) - Solution 1 (Using Stack)
We will use stack to memoize the result (the indices) of previous element.
1. Create a stack ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/stack.java)) and initialize it with 0.
2. Initialize result array S with S[0] = 1 because span value of first element is always 1.
3. Iterate through array A.
4. Empty the stack till element at position given by stack's top is greater than element in current iteration.
5. Result for that iteration will depend on whether stack in empty in above operation.
6. If stack is empty that means current element is greater than all the elements before it. So the result will be it's own position.
7. If stack is not empty that means current element is greater than elements after top of stack.
8. As a last step, push current element to the stack.

<b>Input</b> :  [10, 4, 5, 90, 120, 80]
``` 
[1, 1, 2, 4, 5, 1]
```

### Complexity

|               | Array span      |
| ------------- | --------------- |
| Time          | O(n)            |
| Space         | O(n)            |
