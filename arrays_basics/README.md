#  Arrays – Basics (Foundation of DSA)

This module is designed to master the fundamentals of array manipulation, including indexing, traversal, and frequency counting. Understanding these concepts is the critical first step before diving into advanced Data Structures and Algorithms.

---

##  Problem Set

### 1. Find Maximum & Minimum
Problem: Identify the largest and smallest elements in a given array.  
Approach: Initialize variables with the first element and iterate through the array, updating them as you find larger or smaller values.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Array traversal and linear search logic.

---

### 2. Sum of Array Elements
Problem: Calculate the total sum of all numerical values in an array.  
Approach: Use an accumulator variable and a loop to add each element to the total.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Basic iteration and accumulation patterns.

---

### 3. Count Even & Odd Numbers
Problem: Determine the total count of even and odd integers present in the array.  
Approach: Traverse the array and use the modulo operator (%) to categorize each number.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Conditional logic within loops.

---

### 4. Reverse an Array
Problem: Reorganize the elements so that the last element becomes the first, and so on.  
Approach: Use a two-pointer technique (start and end) to swap elements until they meet in the middle.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: In-place manipulation and two-pointer strategy.

---

### 5. Check if Array is Sorted
Problem: Verify if the elements are in non-decreasing (ascending) order.  
Approach: Compare each element with the next one. If any element is greater than its successor, the array is not sorted.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Early exit conditions in loops.

---

### 6. Find Second Largest Element
Problem: Identify the second-highest value in the array without sorting.  
Approach: Maintain two variables (`largest` and `secondLargest`) and update them in a single pass.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Efficiently tracking multiple state variables.

---

### 7. Remove Duplicates from Sorted Array
Problem: Remove duplicate values from a sorted array such that each element appears only once (in-place).  
Approach: Use two pointers to overwrite duplicates as you find unique elements.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: In-place array updates and index management.

---

### 8. Frequency of Elements
Problem: Count how many times each distinct element appears in the array.  
Approach: Use a boolean "visited" array to keep track of processed elements while iterating with nested loops.  
Complexity: Time — O(N²) | Space — O(N)  
Key Learning: Understanding frequency mapping and auxiliary space.

---

### 9. Left Rotate Array by 1
Problem: Shift all elements one position to the left (the first element moves to the last).  
Approach: Store the first element, shift everything else left, and place the stored element at the end.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Shifting logic and temporary storage.

---

### 10. Right Rotate Array by 1
Problem: Shift all elements one position to the right (the last element moves to the first).  
Approach: Store the last element, shift everything else right, and place the stored element at the beginning.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Handling index boundaries during right-side shifts.