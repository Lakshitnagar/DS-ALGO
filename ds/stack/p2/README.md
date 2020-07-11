# P2 - Problem Statement
Given a string containing symbols (`(,),{,},[,]`), check whether the symbols are balanced.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/p2/S1.java) - Solution 1
1. Create an empty stack ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/stack/Stack.java)).
2. Iterate through the string literals and repeat steps #3 to .
3. If it is not a symbol, ignore it.
4. If opening symbol, push it to the stack.
5. If closing symbol, pop from stack.
6. If stack is empty in step #5, terminate the program, else compare it with symbol in hand.
7. If the closing symbol corresponds to opening symbol, continue, else terminate.
8. If you reach end of the input and stack is not empty, terminate the program.

<b>Input</b> : {1 + [3 * (4-9)]}
``` 
true
```

<b>Input</b> : {1 + [3 * (4-9]}
``` 
false
```

### Complexity

|               | Symbol balanced |
| ------------- | --------------- |
| Time          | O(n)            |
| Space         | O(n)            |
