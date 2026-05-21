# Strings – Advanced (Pattern + Logic)

This module moves beyond basic character manipulation into complex string algorithms. It focuses on advanced coding interview patterns such as the Sliding Window technique, Hash Tracking, Dynamic Programming string matching, and Simulation logic.

---

## Problem Set

### 1. Longest Substring Without Repeating Characters
Problem: Find the length of the longest substring without repeating characters.  
Approach: Use a Sliding Window with a variable `left` pointer and a HashSet/HashMap to track unique characters and dynamic window sizes.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Dynamic Sliding Window strategy.

---

### 2. String Compression
Problem: Compress an array of characters in-place using the counts of repeated characters (e.g., ["a","a","b","b"] -> ["a","2","b","2"]).  
Approach: Use two pointers to read through the array and write the counts sequentially back into the original array.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: In-place string modification and array writing logic.

---

### 3. Check Rotations of Each Other
Problem: Given two strings s1 and s2, check if s2 is a rotated version of s1 (e.g., "abcde" and "cdeab").  
Approach: Concatenate s1 with itself (`s1 + s1`) and check if it contains s2 using standard substring search.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: String replication and hidden symmetry extraction.

---

### 4. Implement strStr()
Problem: Return the index of the first occurrence of a needle string in a haystack string, or -1 if the needle is not part of the haystack.  
Approach: Use a sliding sub-window check (Brute Force) or implement an optimized linear matching algorithm like KMP (Knuth-Morris-Pratt).  
Complexity: Time — O(N*M) or O(N+M) | Space — O(1) or O(M)  
Key Learning: Pattern matching and string searching mechanisms.

---

### 5. Longest Palindromic Substring
Problem: Find the longest contiguous substring that reads the same backward as forward.  
Approach: Use the "Expand Around Center" technique, treating each character (and pairs) as potential symmetry centers.  
Complexity: Time — O(N²) | Space — O(1)  
Key Learning: Centered expansion pattern tracking.

---

### 6. Group Anagrams
Problem: Given an array of strings, group the anagrams together.  
Approach: Iterate through the strings, sort each string to use as a unique key, and group them in a HashMap containing lists.  
Complexity: Time — O(N * K log K) (K = max string length) | Space — O(N * K)  
Key Learning: Categorization via sorted signature keys.

---

### 7. Minimum Window Substring
Problem: Find the minimum window substring in string S that contains all characters of string T.  
Approach: An advanced Sliding Window pattern with two character frequency arrays and a validation counter.  
Complexity: Time — O(N) | Space — O(1) (fixed alphabet sizes)  
Key Learning: Strict tracking within multi-variable sliding windows.

---

### 8. Decode String
Problem: Given an encoded string like `3[a]2[bc]`, return its decoded version (`aaabcbc`).  
Approach: Use two distinct stacks—one to hold numerical repetitions and another to hold accumulated string builders.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Nested expression processing via Stack structures.

---

### 9. Valid Parentheses
Problem: Check if a string containing symbols `(`, `)`, `{`, `}`, `[`, `]` closes elements in the correct configuration sequence.  
Approach: Push opening symbols onto a stack and pop them out to validate when a matching closing symbol appears.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: LIFO property matching.

---

### 10. Multiply Strings
Problem: Multiply two non-negative integers represented as strings without using built-in BigInteger or direct type conversions.  
Approach: Mimic standard digit-by-digit manual multiplication logic using an index-positioned array to accumulate mathematical place values.  
Complexity: Time — O(N * M) | Space — O(N + M)  
Key Learning: Mathematical simulation logic.