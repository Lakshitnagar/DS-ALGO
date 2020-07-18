# P1 - Problem Statement
Given a generic tree find the sum of all nodes.

## [S1](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/genericTree/p2/S1.java) - Solution 1
1. Create a generic tree ([using previous problem](https://github.com/Lakshitnagar/DS-ALGO/blob/master/ds/genericTree/GenericTree.java)).
2. Recursively call findSum function in sequence, currentNode -> firstChild -> nextSibling.

### Complexity

|               | Insertion     |
| ------------- | ------------- |
| Time          | O(n)          |
| Space         | O(n)          |
