# Queue (FIFO Logic)

The queue is a fundamental FIFO (First-In, First-Out) data structure. While stacks handle backtracking and nested history, queues manage orderly processing, scheduling pipelines, stream flows, and breadth-first expansions. This module explores linear arrays, resource-efficient circular configurations, cross-structural simulations, and advanced interview engines like LRU Caches.

---

## Problem Set

### 1. Implement Queue Using Array
Problem: Build a sequential first-in-first-out structure from scratch using a fixed-size array.  
Approach: Maintain two separate index pointers: `front` (to track extraction points) and `rear` (to track insertion boundaries).  
Complexity: Time — O(1) for both operations | Space — O(N)  
Key Learning: Managing independent tracking pointers across linear memory segments.

---

### 2. Circular Queue
Problem: Solve the memory wastage issue of standard array queues where emptied front slots cannot be reused.  
Approach: Connect the endpoints of the array conceptually using modulo arithmetic operations (`(rear + 1) % capacity`) to circle back to the beginning.  
Complexity: Time — O(1) | Space — O(N)  
Key Learning: Ring-buffer optimization mechanics for circular index wrapping.

---

### 3. Queue Using Stack
Problem: Simulate a functional First-In-First-Out (FIFO) queue behavior using only Last-In-First-Out (LIFO) stacks.  
Approach: Maintain two distinct stacks. For an extraction operation, transfer elements from the input stack to an output stack to completely invert their linear retrieval order.  
Complexity: Time — Push: O(1), Pop: O(N) amortized | Space — O(N)  
Key Learning: Manipulating structural extraction behaviors through composition.

---

### 4. Stack Using Queue
Problem: Simulate a functional Last-In-First-Out (LIFO) stack behavior using only First-In-First-Out (FIFO) queues.  
Approach: Use a single or dual-queue configuration. When pushing a new element, cycle the existing elements sequentially out of the front and re-enqueue them behind the new element.  
Complexity: Time — Push: O(N), Pop: O(1) | Space — O(N)  
Key Learning: Forcing reverse retrieval properties through rotational element cycling.

---

### 5. First Non-Repeating Character in Stream
Problem: Track the first unique character continuously as an unpredictable stream of characters arrives in real time.  
Approach: Combine a frequency map array with a queue. Push each incoming character to the queue; when reading the unique element, pop non-unique elements off the front.  
Complexity: Time — O(1) per character | Space — O(1) (fixed alphabet tracking)  
Key Learning: Maintaining real-time streaming states through immediate look-ahead filtration.

---

### 6. Sliding Window Maximum
Problem: Find the maximum element inside a moving sub-window of size K as it slides across an array from left to right.  
Approach: Utilize a Monotonic Doubly-Ended Queue (Deque). Keep indices sorted such that the largest element within the active window boundaries always sits at the front.  
Complexity: Time — O(N) | Space — O(K)  
Key Learning: Optimizing range queries by dropping elements that can never become window peaks.

---

### 7. Generate Binary Numbers
Problem: Print all binary number representations from 1 up to a target number N using a queue structure.  
Approach: Enqueue the starting string `"1"`. For each iteration, dequeue the front string, append `"0"` and `"1"` to generate the next numbers, and enqueue both strings back.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Simulating explicit level-order structural generations.

---

### 8. Reverse Queue
Problem: Completely reverse the interior ordering sequence of a queue without utilizing secondary temporary arrays.  
Approach: Use the internal runtime Call Stack via recursion. Empty the queue by unwinding into the call stack, then enqueue elements back as the stack winds down.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Transferring data states from explicit FIFO storage to implicit LIFO call stacks.

---

### 9. Rotten Oranges
Problem: Calculate the minimum time required for all fresh oranges in a grid to rot, given that a rotten orange rots its neighbors every minute.  
Approach: Apply Breadth-First Search (BFS) using a coordinate queue. Enqueue all initial rotten positions, and track progression level-by-level as time clicks forward.  
Complexity: Time — O(R * C) | Space — O(R * C)  
Key Learning: Modeling multi-source spatial propagation tracking using queue levels.

---

### 10. LRU Cache
Problem: Design a Least Recently Used (LRU) Cache capacity engine that evicts the oldest items when limits are breached.  
Approach: Pair a standard HashMap for constant-time key lookups with a Doubly Linked List (acting as a manual priority queue) to shift accessed items to the front instantly.  
Complexity: Time — O(1) for both get and put operations | Space — O(Capacity)  
Key Learning: Structuring systems architecture by anchoring maps to self-referential linked items.