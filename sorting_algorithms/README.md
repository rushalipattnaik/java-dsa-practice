# Sorting Algorithms

Sorting is a fundamental building block of computer science. It changes how data is arranged, directly affecting the efficiency of other algorithms like Binary Search. This module covers the full spectrum of sorting—from intuitive $O(N^2)$ comparison loops to highly optimized $O(N \log N)$ divide-and-conquer structures, as well as specialized linear-time non-comparison algorithms.

---

## Problem Set

### 1. Bubble Sort
Problem: Sort an array in ascending order by repeatedly swapping adjacent elements if they are in the wrong order.  
Approach: Run nested loops. Pass through the array multiple times, causing the largest unsorted element to "bubble up" to its correct position at the end of each pass. Optimize using a swap flag.  
Complexity: Time — O(N²) | Space — O(1)  
Key Learning: Element-by-element ripple propagation.

---

### 2. Selection Sort
Problem: Sort an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.  
Approach: Divide the array conceptually into a sorted and an unsorted boundary. Find the absolute smallest element in the unsorted segment and swap it directly into the current boundary index.  
Complexity: Time — O(N²) | Space — O(1)  
Key Learning: Linear scans to isolate global minimum values.

---

### 3. Insertion Sort
Problem: Sort an array by picking elements one by one and inserting them into their correct position relative to an already sorted subarray.  
Approach: Iterate through the array. For each element, shift all preceding elements that are greater than it one position to the right to clear a matching slot, then drop the element in.  
Complexity: Time — O(N²) | Space — O(1)  
Key Learning: Dynamic structure building, highly efficient for nearly-sorted data.

---

### 4. Merge Sort
Problem: Sort an array using a stable, predictable strategy that works well for large datasets.  
Approach: A classic Divide and Conquer strategy. Recursively split the array down into two halves until individual single-element arrays are isolated, then recombine them using a two-pointer structural merge process.  
Complexity: Time — O(N log N) | Space — O(N)  
Key Learning: Stable sorting, recursion trees, and out-of-place structural merging.



---

### 5. Quick Sort
Problem: Sort an array efficiently in-place without the high memory cost of Merge Sort.  
Approach: Choose a target element as a `pivot`. Partition the array so that all elements smaller than the pivot move to its left and all larger elements move to its right, then recursively repeat the process for both halves.  
Complexity: Time — O(N log N) average / O(N²) worst | Space — O(log N) stack memory  
Key Learning: Pivot targeting, in-place elements positioning, and unstable division.

---

### 6. Counting Sort
Problem: Sort an array containing integers within a specific, small numerical range faster than $O(N \log N)$.  
Approach: A non-comparison sorting technique. Create a frequency index array mapping out every integer value to count occurrences, then rebuild the array sequentially using prefix tracking.  
Complexity: Time — O(N + K) | Space — O(K) (where K is the range scale size)  
Key Learning: Breaking the $O(N \log N)$ comparison barrier using key-value counting.

---

### 7. Sort Colors (Dutch National Flag)
Problem: Sort an array containing only 0s, 1s, and 2s in-place in a single pass (e.g., `[2,0,2,1,1,0]`).  
Approach: Use three distinct tracking pointers (`low`, `mid`, `high`). Evaluate the value at `mid`—swap 0s to the left (`low`), leave 1s in place, and swap 2s to the right (`high`).  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Three-way linear tracking and segment grouping.

---

### 8. Kth Largest Element
Problem: Find the $K$-th largest element in an unsorted array without fully sorting it first.  
Approach: Use the QuickSelect algorithm (based on QuickSort partitioning) or a Min-Heap of size $K$. QuickSelect reduces the search space by only recurring into the partition that contains the target index.  
Complexity: Time — O(N) average / O(N²) worst | Space — O(1)  
Key Learning: Finding specific ranks without paying the performance cost of a full sort.

---

### 9. Sort Array By Parity
Problem: Rearrange an array so that all even integers come first, followed by all odd integers.  
Approach: Use a two-pointer approach (start and end). Move the left pointer forward while elements are even, move the right pointer backward while elements are odd, and swap them when they are out of place.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: In-place segregation using two pointers.

---

### 10. Minimum Swaps to Sort Array
Problem: Find the minimum number of swaps required to completely sort an unsorted array of unique elements.  
Approach: Map elements to their correct sorted target indices. Iterate through the array and track visited elements to find disjoint structural "cycles"—a cycle of size $M$ requires exactly $M - 1$ swaps to fix.  
Complexity: Time — O(N log N) (due to mapping) | Space — O(N)  
Key Learning: Using cycle detection graph concepts to solve ordering problems.