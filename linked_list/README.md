# Linked List

Linked lists shift our understanding of data layout from contiguous, predefined memory blocks to dynamically allocated structures scattered across the heap. Mastery over linked lists requires absolute pointer precision—handling address updates without losing references, breaking cycles, and manipulating nodes in-place. This module spans from custom implementations to core interview layout patterns.

---

## Problem Set

### 1. Singly Linked List Implementation
Problem: Construct a standard functional Singly Linked List blueprint from scratch.  
Approach: Define a self-referential nested `Node` class containing a data field and a pointer link reference (`next`) to the succeeding node instance.  
Complexity: Time — O(1) initialization | Space — O(1)  
Key Learning: Structuring foundational dynamic data nodes using reference memory anchors.

---

### 2. Insert at Beginning/End
Problem: Add a brand new data node seamlessly at either the entry point (head) or the termination point (tail) of a list.  
Approach: For the beginning, point the new node's next field to the current head. For the end, traverse through the sequence until a null pointer is found, then link the last node to the new element.  
Complexity: Time — Beginning: O(1), End: O(N) | Space — O(1)  
Key Learning: Re-routing execution streams using head re-assignments and linear sequence scans.

---

### 3. Delete a Node
Problem: Safely delete a target node from a list given its value or explicit address, ensuring no subsequent memory chains are lost.  
Approach: Scan until you find the node immediately preceding the target element. Change its pointer tracking link to jump completely over the target node, connecting directly to `target.next`.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Isolating and removing data segments by altering neighboring references.

---

### 4. Reverse Linked List
Problem: Invert the execution flow direction of an entire linked list in-place using a single pass traversal.  
Approach: Maintain three independent reference tracking pointers concurrently: `curr`, `prev`, and `next`. Iterate through the structure, altering each node's internal link pointer backwards.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Iterative track shifting and link restructuring without declaring extra structural clones.



---

### 5. Find Middle of Linked List
Problem: Isolate the exact middle node of a linked list in a single traversal pass.  
Approach: Apply Floyd’s Cycle-Finding variant (Tortoise and Hare). Maintain two traversal references; advance the `slow` pointer by one node step and the `fast` pointer by two node steps simultaneously.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Utilizing relative speed differentials to determine internal structural dimensions.

---

### 6. Detect Cycle
Problem: Determine if a linked list contains an infinite looping pathway where a node points back to an earlier element.  
Approach: Deploy the fast and slow pointer strategy. If a looping ring cycle exists, the fast pointer will eventually close the loop distance gap and crash into the slow pointer.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Identifying infinite loop bugs using pointer intersection loops.

---

### 7. Remove Cycle
Problem: Locate the entry point of a loop inside a linked list and sever the cyclical connection to restore linear flow.  
Approach: Once a loop collision is confirmed, place one pointer at the start `head` and keep another at the collision node. Advance both pointers one step at a time; they will meet precisely at the loop origin index. Set the terminal link to null.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Using pointer topology math properties to locate internal circuit connections.

---

### 8. Merge Two Sorted Lists
Problem: Combine two pre-sorted lists into a single consolidated, sorted output list.  
Approach: Create a tracking anchor node (`dummy`). Use two distinct pointer tracks to evaluate the values at the head of both lists, appending the smaller value to the dummy track sequentially.  
Complexity: Time — O(N + M) | Space — O(1)  
Key Learning: Linear multi-track stitching and dummy node utilization patterns.

---

### 9. Intersection of Two Linked Lists
Problem: Locate the precise structural node where two independent list paths converge into a shared sequence chain.  
Approach: Track both list tracks simultaneously using dual pointers. When either pointer strikes the end marker null position, instantly redirect it to the head of the opposite list to equalize structural path deviations.  
Complexity: Time — O(N + M) | Space — O(1)  
Key Learning: Offsetting structural length boundaries using cross-linked pointer transitions.

---

### 10. Palindrome Linked List
Problem: Determine if the value pattern inside a linked list reads identically forwards and backwards.  
Approach: Locate the absolute structural midpoint of the list, reverse the remaining second-half structural sub-chain, and run a direct element-by-element value comparison from both outermost ends.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Fragmenting, reversing, and re-evaluating structural combinations in linear time.