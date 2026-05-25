# Recursion

Recursion shifts your programming perspective from iterative loops to self-referential tracking. This module serves as a foundation for advanced trees, graphs, and dynamic programming by teaching you how to split large data problems into identical sub-problems, manipulate call stacks, and define clean base cases.

---

## Problem Set

### 1. Print Numbers Using Recursion
Problem: Print numbers from 1 to N (or N to 1) without using loops.  
Approach: Leverage the natural execution order of the method call stack. Print before the recursive invocation for descending order, or after it for ascending order.  
Complexity: Time — O(N) | Space — O(N) (due to call stack depth)  
Key Learning: Understanding execution processing order (Head vs. Tail recursion).

---

### 2. Factorial Using Recursion
Problem: Find the factorial value of a given positive integer $N!$.  
Approach: Establish a base condition return of 1 when $N \le 1$. Otherwise, compute $N \times \text{factorial}(N - 1)$.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Direct linear bottom-up mathematical accumulation.

---

### 3. Fibonacci Using Recursion
Problem: Find the $N$-th numerical position within the standard Fibonacci sequence.  
Approach: Return $N$ if $N \le 1$. Otherwise, branch out the execution pipeline by summing $\text{fib}(N-1) + \text{fib}(N-2)$.  
Complexity: Time — $O(2^N)$ | Space — O(N)  
Key Learning: Branching recursive trees and redundancy discovery.

---

### 4. Sum of Digits (Recursive)
Problem: Compute the absolute sum total of all distinct numerical digits within an integer.  
Approach: Extract the trailing digit with modulo (`% 10`), add it to the recursive return of the truncated number (`/ 10`), and stop when the number reaches 0.  
Complexity: Time — O(log₁₀ N) | Space — O(log₁₀ N)  
Key Learning: Processing numeric states step-by-step through structural reduction.

---

### 5. Reverse a String (Recursive)
Problem: Reorganize a string backward using a recursive call structure instead of loops or array pointers.  
Approach: Remove the first character, reverse the remaining substring recursively, and append the extracted character to the end of that result.  
Complexity: Time — O(N²) (due to string concatenation) | Space — O(N)  
Key Learning: Post-processing accumulation within stack winding operations.

---

### 6. Check Palindrome (Recursive)
Problem: Determine if a string is symmetrical by looking at matching inner segments recursively.  
Approach: Compare the first and last characters. If they match, strip them away and repeat the process on the remaining inner string. Stop when the string length drops below 2.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Multi-conditional early termination paths.

---

### 7. Power Function
Problem: Compute the mathematical exponent result of $x^n$ using a recursive function.  
Approach: Use the Binary Exponentiation strategy. If $n$ is even, compute $x^{n/2} \times x^{n/2}$; if $n$ is odd, multiply an extra $x$ to the product.  
Complexity: Time — O(log N) | Space — O(log N)  
Key Learning: Divide-and-conquer strategy for logarithmic optimization.

---

### 8. Tower of Hanoi
Problem: Transfer a stack of $N$ disks from a source rod to a destination rod using an auxiliary rod while following mathematical ordering constraints.  
Approach: Move $N-1$ disks from source to auxiliary, move the largest disk directly to the destination, and then move the $N-1$ disks from auxiliary to destination.  
Complexity: Time — $O(2^N)$ | Space — O(N)  
Key Learning: Visualizing complex multi-step puzzle tracking logic.

---

### 9. Generate All Subsets
Problem: Find every possible grouping configuration (the power set) from an array of numbers.  
Approach: Use the "Inclusion/Exclusion" pattern. At each element index, fork the execution branch—one path includes the current element in the subset, while the other skips it.  
Complexity: Time — $O(2^N)$ | Space — O(N)  
Key Learning: Combinatorial state exploration.

---

### 10. Permutations of a String
Problem: Generate all possible unique ordering configurations from the characters of a string.  
Approach: Fix a character at the target starting position, recursively find permutations for the remaining characters via index swapping, and restore states afterward.  
Complexity: Time — $O(N \times N!)$ | Space — O(N)  
Key Learning: Backtracking and state restoration tree patterns.