# P6 - Problem Statement
Given an array of integers, find the maximum area that can be formed in that histogram.

![alt text](https://media.geeksforgeeks.org/wp-content/cdn-uploads/histogram1.png)\
Reference : https://stackoverflow.com/questions/4311694/maximize-the-rectangular-area-under-histogram

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p6/S1.java) - Solution 1
Using the [increasing stack](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p5), we can know the first lower in left as well as right in linear time.\
so area would be height*(right-1 - left)

<b>Input</b> :  [6, 2, 5, 4, 5, 1, 6]

<b>Output</b> :
``` 
12
```
note: -1 indicates index of left out of bound and 6 indicates index of right out of bound

### Complexity

|               | Increasing stack|
| ------------- | --------------- |
| Time          | O(n)            |
| Space         | O(n)            |
