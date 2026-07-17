# Dynamic Programming

Dynamic Programming (DP) represents the peak of algorithmic optimization, transforming exponential, redundant recursive frameworks into highly efficient polynomial-time operations. The core philosophy centers on breaking complex global architectures down into interdependent local choices, computing each unique subproblem state exactly once, and storing the evaluation results for fast lookup. This module builds intuition from simple, linear state progressions up to multi-dimensional grid structures, sequence alignment layers, and matrix-based decision horizons.

---

## Problem Set

### 1. Fibonacci (DP)
Problem: Compute the N-th Fibonacci number efficiently without repeating redundant calculation trees.  
Approach: Transition from a naive double-recursive design (O(2^N)) to a linear framework (O(N)). Track states using top-down memoization (an array cache) or bottom-up tabulation, which can be further optimized to O(1) space by maintaining only the last two calculated numerical states.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Identifying overlapping subproblems and applying space-saving structural caching.

---

### 2. Climbing Stairs
Problem: Find the total number of distinct ways to reach the top of an N-step staircase if you can climb either 1 or 2 steps at a time.  
Approach: Formulate the state transition relation where the total combinations to reach the current index I is the exact sum of the ways to reach step I-1 plus step I-2 (dp[i] = dp[i-1] + dp[i-2]).  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Mapping physical choice paths onto fundamental mathematical recurrence relations.

---

### 3. House Robber
Problem: Maximize the total cash looted from a row of houses without robbing any two houses that are immediately adjacent to each other.  
Approach: For every house encountered, make a binary decision: either rob the current house (adding its value to the total from two houses back) or skip it entirely (carrying forward the loot accumulated up to the previous house): dp[i] = max(dp[i-1], house[i] + dp[i-2]).  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Managing mutually exclusive situational choices across linear arrays.

---

### 4. 0/1 Knapsack
Problem: Select a subset of items with given weights and profits to maximize total value inside a knapsack bounded by a maximum capacity constraint W.  
Approach: Build a 2D state space table where rows map available item pools and columns map incremental weight capacities. For each item cell, evaluate the trade-off between excluding the item versus including it by consuming its weight footprint: dp[i][w] = max(dp[i-1][w], profit[i-1] + dp[i-1][w - weight[i-1]]).  
Complexity: Time — O(N * W) | Space — O(W) with single-row optimization  
Key Learning: Resolving multi-variable constraint boundaries using state arrays.

---

### 5. Subset Sum
Problem: Determine whether there exists a subset within a collection of non-negative integers whose elements add up exactly to a target value K.  
Approach: Model the state space as a boolean matrix where dp[i][j] tracks whether a target sum j can be formed using the first i elements. Optimize memory allocations by scaling down the tracker into a single-dimensional backward-looping array.  
Complexity: Time — O(N * K) | Space — O(K)  
Key Learning: Utilizing boolean state propagation tables to verify target condition matching.

---

### 6. Longest Common Subsequence (LCS)
Problem: Discover the maximum length of a shared character subsequence between two independent strings, without altering the relative order of the characters.  
Approach: Align both sequences across a 2D grid. If the characters at indexes matching I and J align perfectly, increment the sequence chain from the diagonal base (1 + dp[i-1][j-1]). Otherwise, inherit the best result from the neighboring cells (max(dp[i-1][j], dp[i][j-1])).  
Complexity: Time — O(M * N) | Space — O(M * N)  
Key Learning: Structuring two-pointer coordinate matching matrices to evaluate string alignment.

---

### 7. Longest Increasing Subsequence (LIS)
Problem: Find the maximum length of a subsequence within an array such that all elements in the subsequence are sorted in strictly ascending order.  
Approach: Solve linearly via a nested tabulation check by comparing each element against all prior entries (O(N^2)), or optimize to a faster logarithmic strategy by combining patience sorting with binary search tracking slots.  
Complexity: Time — O(N log N) | Space — O(N)  
Key Learning: Replacing nested iteration patterns with dynamic binary search tracking slots.

---

### 8. Coin Change
Problem: Calculate the absolute minimum number of coins needed to make up a target amount, given an array of varied currency denominations.  
Approach: Initialize a 1D tabulation array up to the target amount, filled with infinity tokens. For each step value, loop through all available coins, setting the cell value to the minimum combination found: dp[i] = min(dp[i], 1 + dp[i - coin]).  
Complexity: Time — O(N * C) | Space — O(C) where C is target amount  
Key Learning: Structuring target-minimization search loops over unbounded item choices.

---

### 9. Edit Distance
Problem: Find the minimum number of single-character operations (Insert, Delete, Replace) required to transform string A into string B.  
Approach: Establish a 2D matching canvas matrix. When characters differ, evaluate the structural cost of all three operations simultaneously, picking the absolute cheapest transition path: 1 + min(insert, delete, replace).  
Complexity: Time — O(M * N) | Space — O(M * N)  
Key Learning: Tracking multi-operation transformation costs inside string matrix cells.

---

### 10. Matrix Chain Multiplication (MCM)
Problem: Determine the most efficient way to multiply a given sequence of matrices, minimizing the total count of scalar multiplications.  
Approach: Implement a partition-based interval DP strategy. Analyze dynamic range spans [i, j] by placing splitting dividers at every possible index position K between them, recursively minimizing the total combined processing cost: cost(i, k) + cost(k+1, j) + multiplication_cost.  
Complexity: Time — O(N^3) | Space — O(N^2)  
Key Learning: Splitting continuous ranges into smaller optimal sub-intervals using partition limits.
```