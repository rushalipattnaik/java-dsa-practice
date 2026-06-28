# Trees & BST 

Trees break away from linear data tracking, introducing hierarchical relationships where a single parent branch splits into multiple sub-choices. Mastering trees requires a strong grasp of recursion, structural depth analysis, and search space reduction using Binary Search Tree (BST) ordering properties. This module covers foundational traversals, structural metrics, and dynamic node manipulations.

---

## Problem Set

### 1. Binary Tree Traversal (In, Pre, Post)
Problem: Visit every node in a binary tree exactly once using depth-first strategies.  
Approach: Implement three structural traversal orders recursively:  
* **In-Order:** Left Subtree $\rightarrow$ Root $\rightarrow$ Right Subtree  
* **Pre-Order:** Root $\rightarrow$ Left Subtree $\rightarrow$ Right Subtree  
* **Post-Order:** Left Subtree $\rightarrow$ Right Subtree $\rightarrow$ Root  
Complexity: Time — O(N) | Space — O(H) where H is tree height  
Key Learning: Navigating deep branching paths using structural call-stack frames.

---

### 2. Level Order Traversal
Problem: Visit nodes layer-by-layer horizontally from top to bottom and left to right.  
Approach: Implement a Breadth-First Search (BFS) tracking model using a FIFO queue. Process the active node pool at the current depth while pushing their respective child components behind them.  
Complexity: Time — O(N) | Space — O(W) where W is max tree width  
Key Learning: Managing layer-by-layer state horizons using explicit queue buffers.

---

### 3. Height of Tree
Problem: Calculate the maximum depth distance from the root node down to the deepest leaf node.  
Approach: Compute the heights of the left and right subtrees recursively. The total height at any node is $1 + \max(\text{left\_height}, \text{right\_height})$.  
Complexity: Time — O(N) | Space — O(H)  
Key Learning: Accumulating structural dimensions bottom-up via recursive returns.

---

### 4. Count Nodes
Problem: Determine the total number of node elements populated inside a binary tree structure.  
Approach: Count the nodes in the left branch, count the nodes in the right branch, and add them together along with the root element ($1 + \text{left\_count} + \text{right\_count}$).  
Complexity: Time — O(N) | Space — O(H)  
Key Learning: Aggregating total structural density across disjoint branches.

---

### 5. Check Balanced Tree
Problem: Verify if a binary tree is height-balanced, meaning the left and right subtree heights at any node never differ by more than 1.  
Approach: Modify the standard height function to return $-1$ early if any local subtree encounters a height imbalance violation ($|\text{left\_height} - \text{right\_height}| > 1$).  
Complexity: Time — O(N) | Space — O(H)  
Key Learning: Combining structural inspection with early-exit failure signaling.

---

### 6. Diameter of Tree
Problem: Find the length of the longest path between any two leaf nodes in a tree (this path may or may not pass through the root).  
Approach: For every node, calculate the sum of its left and right subtree heights. Maintain a global variable to track the maximum sum encountered during the traversal.  
Complexity: Time — O(N) | Space — O(H)  
Key Learning: Evaluating localized cross-branch spans during a unified tree crawl.

---

### 7. Lowest Common Ancestor (LCA)
Problem: Find the deepest shared parent node for two target nodes, $P$ and $Q$.  
Approach: Traverse down the tree. If a node matches $P$ or $Q$, pass it up. If a node receives non-null references from both its left and right subtrees, that node is their unique convergence root.  
Complexity: Time — O(N) | Space — O(H)  
Key Learning: Passing target markers up a branching hierarchy to locate convergence points.

---

### 8. Validate BST
Problem: Check if a binary tree satisfies the strict structural rules of a Binary Search Tree.  
Approach: Pass down dynamic tracking boundaries ($\min$ and $\max$) during a top-down traversal. Ensure every node's value falls strictly within its inherited range $(\min < \text{node.val} < \max)$.  
Complexity: Time — O(N) | Space — O(H)  
Key Learning: Enforcing directional constraints down structural paths using value intervals.

---

### 9. Insert & Delete in BST
Problem: Safely add or remove elements in a BST while preserving its ordered layout rules.  
Approach: For insertion, filter down left or right based on value comparisons until hitting an empty spot. For deletion, handle three specific structural layouts: removing a leaf, bypassing a single-child node, or replacing a two-child node with its in-order successor.  
Complexity: Time — O(H) | Space — O(H)  
Key Learning: Managing structural mutations and link re-routing in a sorted hierarchy.

---

### 10. Kth Smallest Element in BST
Problem: Find the $K\text{-th}$ smallest value stored inside an ordered Binary Search Tree.  
Approach: Perform a controlled In-Order traversal (which visits elements in naturally sorted ascending order). Keep a counter of visited nodes, and stop the search the exact moment the counter hits $K$.  
Complexity: Time — O(H + K) | Space — O(H)  
Key Learning: Utilizing implicit properties to turn structural traversals into index searches.
```