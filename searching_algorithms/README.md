# 🔍 Searching Algorithms 

Searching efficiently is about understanding structural constraints. While unsorted data forces us to check every element sequentially, sorted datasets or localized trends allow us to discard entire sections of data at every step. This module builds an efficiency mindset by scaling search operations from $O(N)$ linear scans down to $O(\log N)$ boundary reductions.

---

## Problem Set

### 1. Linear Search
Problem: Find the index of a target element in an unsorted array.  
Approach: Traverse the array from start to finish, checking each element sequentially.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Baseline approach when no data structure invariants or sorted guarantees exist.

---

### 2. Binary Search
Problem: Find the index of a target element in a strictly sorted array.  
Approach: Maintain `low` and `high` pointers. Calculate the middle index, evaluate it, and discard the left or right half of the remaining array.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Halving the search space recursively or iteratively.



---

### 3. First & Last Occurrence
Problem: Find the starting and ending index of a target element that appears multiple times in a sorted array.  
Approach: Modify standard Binary Search. When the target is found, don't stop; keep searching left to find the first occurrence, or right to find the last occurrence.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Adjusting search pointers to capture target boundaries.

---

### 4. Count Occurrences in Sorted Array
Problem: Determine how many times a target element appears in a sorted array.  
Approach: Find the first and last occurrence indices using modified binary search, then calculate: `(lastIndex - firstIndex) + 1`.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Combining boundary searches to calculate structural frequency in logarithmic time.

---

### 5. Search in Rotated Sorted Array
Problem: Find a target element in a sorted array that has been shifted/rotated at an unknown pivot point (e.g., `[4,5,6,7,0,1,2]`).  
Approach: Identify which half of the array is normally sorted at the middle element, check if the target lies within its range, and adjust boundaries accordingly.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Exploiting localized sorting properties within altered arrays.

---

### 6. Find Peak Element
Problem: Find a peak element in an array where an element is a peak if it is strictly greater than its neighbors.  
Approach: Use binary search to look at slopes. If the middle element is less than its right neighbor, a peak must exist on the right side; otherwise, it's on the left.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Applying binary search concepts to unsorted arrays based on trends/slopes.

---

### 7. Square Root Using Binary Search
Problem: Compute the floor value of the square root of a non-negative integer $x$ without using built-in math functions.  
Approach: Treat the range $[1, x]$ as a sorted search space. Use binary search to find an integer $m$ such that $m \times m \le x$.  
Complexity: Time — O(log x) | Space — O(1)  
Key Learning: Searching over an abstract numerical range rather than a concrete array.

---

### 8. Minimum in Rotated Sorted Array
Problem: Find the smallest element in a sorted array that has been rotated.  
Approach: Compare the middle element with the rightmost element. If `arr[mid] > arr[right]`, the minimum lies in the right unsorted half; otherwise, it lies in the left half.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Locating discontinuity boundaries in a broken sequence.

---

### 9. Search in Infinite Sorted Array
Problem: Find the index of a target element in a sorted array of infinite or unknown size where checking an out-of-bounds index throws an error.  
Approach: Start with a window size of 1. Continually double the upper bound (`high = high * 2`) until the target is less than or equal to the value at `high`, then run standard binary search within that bounds window.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Exponential growth bounding before logarithmic reduction.

---

### 10. Allocate Minimum Pages
Problem: Allocate books among $M$ students such that the maximum number of pages allocated to any student is minimized (Hard interview classic).  
Approach: Apply Binary Search on Answers. The search range spans from the maximum single book pages (lower limit) to the sum of all book pages (upper limit). Check the feasibility of the middle values using a greedy distribution helper function.  
Complexity: Time — O(N * log(Sum of Pages)) | Space — O(1)  
Key Learning: The "Binary Search on Answer" framework for complex optimization tasks.