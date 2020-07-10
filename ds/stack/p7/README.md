# P7 - Problem Statement
Given a string recursively remove adjacent duplicate.
For example "career" => "ca" or "mississippi" => "m".

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p7/S1.java) - Solution 1 (In place stack)
1. Maintain an empty array of chars `outputStr` and a stack pointer `stackPtr` as -1;
2. Iterate and push chars from input string to `outputStr` if the top char in `outputStr` is not equals to current char.
3. Else, skip the chars in input string till they are equal and then decrease `stackPtr` by one

<b>Input</b> :  "mississippi"

<b>Output</b> :
``` 
"m"
```

### Complexity

|               | Remove duplicate|
| ------------- | --------------- |
| Time          | O(n)            |
| Space         | O(n)            |
