# Arrays – Intermediate 

This module transitions from basic traversal to algorithmic problem-solving. Here, we focus on optimizing time complexity from O(N²) to O(N) using techniques like HashMaps, Two Pointers, and Greedy Algorithms.

---

## Problem Set

### 1. Move Zeros to End
Problem: Move all 0s to the end of the array while maintaining the relative order of non-zero elements.  
Approach: Use a non-zero index pointer to overwrite elements in-place, then fill the remaining positions with zeros.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: In-place array transformation.

---

### 2. Union & Intersection of Arrays
Problem: Find the unique common elements (Intersection) and all unique elements from both arrays (Union).  
Approach: Use Two Pointers (if sorted) or a HashSet (if unsorted) to manage unique values.  
Complexity: Time — O(N + M) | Space — O(N + M)  
Key Learning: Using Sets for uniqueness and combining datasets.

---

### 3. Find Missing Number
Problem: Given an array containing n-1 integers in the range [1, n], find the missing number.  
Approach: Use the mathematical sum formula $n(n+1)/2$ and subtract the array sum, or use XOR logic.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Using math to solve array gaps efficiently.

---

### 4. Maximum Subarray Sum (Kadane’s)
Problem: Find the contiguous subarray which has the largest sum.  
Approach: Iterate through the array, adding the current element to a running sum. Reset the sum to 0 if it becomes negative.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Dynamic programming/Greedy thinking (Kadane’s Algorithm).

---

### 5. Longest Consecutive Sequence
Problem: Find the length of the longest consecutive elements sequence (e.g., [100, 4, 200, 1, 3, 2] -> 4 for [1,2,3,4]).  
Approach: Use a HashSet to store elements, then look for the start of a sequence (num - 1 not in set).  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Optimizing searches with Hash-based structures.

---

### 6. Two Sum
Problem: Find two indices such that the numbers at those indices add up to a specific target.  
Approach: Use a HashMap to store (value, index) pairs and check if (target - current) exists as you iterate.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: The complement search pattern.

---

### 7. Best Time to Buy & Sell Stock
Problem: Find the maximum profit you can achieve by buying on one day and selling on a future day.  
Approach: Track the minimum price seen so far and calculate the potential profit at each step.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: One-pass profit maximization logic.

---

### 8. Majority Element
Problem: Find the element that appears more than n/2 times in the array.  
Approach: Use Moore’s Voting Algorithm—track a candidate and a count that increments/decrements.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Optimal frequency detection without extra space.

---

### 9. Product of Array Except Self
Problem: Return an array where each element is the product of all elements except the one at that index.  
Approach: Use prefix and suffix products to calculate the result without using the division operator.  
Complexity: Time — O(N) | Space — O(1) (excluding result array)  
Key Learning: Prefix/Suffix accumulation.

---

### 10. Container with Most Water
Problem: Find two lines that together with the x-axis form a container that holds the most water.  
Approach: Use Two Pointers (left and right), moving the pointer that points to the shorter line.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Two-pointer area maximization.