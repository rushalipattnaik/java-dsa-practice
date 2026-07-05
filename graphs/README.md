# Graphs 

Graphs move beyond rigid linear chains and hierarchical tree systems into complex, interconnected network topologies. Elements are modeled as sets of vertices (nodes) bound together by edges (relations). Mastering graphs requires fluent state-tracking across cyclical pathways, multi-directional traversals, and cost-optimal space planning. This module covers essential representations, traversals, cycle tests, and advanced spatial propagation engines.

---

## Problem Set

### 1. Graph Representation (Adj List)
Problem: Construct and store an extensible, memory-efficient graph layout using an Adjacency List configuration.  
Approach: Instantiate an array or list of lists where every index position maps out a unique vertex, pointing to a dynamic collection storing its immediate neighbor elements.  
Complexity: Time — O(V + E) | Space — O(V + E)  
Key Learning: Conserving memory footprint layout space relative to dense, sparse adjacency matrices.

---

### 2. BFS (Breadth-First Search)
Problem: Traversal explore a graph uniformly level-by-level starting from a designated source root node.  
Approach: Employ a FIFO queue paired with a global boolean array map to block structural double-visit loops. Process the node at the front, then enqueue all unvisited neighbors.  
Complexity: Time — O(V + E) | Space — O(V)  
Key Learning: Calculating shortest paths across unweighted environments via expanding frontier levels.

---

### 3. DFS (Depth-First Search)
Problem: Traversal dive deep into a graph along separate branch tracks until hitting a dead-end before backtracking.  
Approach: Create a recursive execution path or utilize an explicit LIFO structure combined with a tracking array map to record visited nodes.  
Complexity: Time — O(V + E) | Space — O(V)  
Key Learning: Crawling relational topologies using implicit call-stack track memory.

---

### 4. Detect Cycle (Undirected Graph)
Problem: Verify if an undirected graph system contains a loop circuit pathway that connects a node back to itself.  
Approach: Fire off BFS or DFS tracking. If an exploration path encounters an already visited node that isn't the immediate parent index of the active step, a cycle exists.  
Complexity: Time — O(V + E) | Space — O(V)  
Key Learning: Tracking directional tracking origins to pinpoint structural loops.

---

### 5. Detect Cycle (Directed Graph)
Problem: Determine if a directed graph contains a closed path where following the arrow edges leads back to a starting position.  
Approach: Run DFS while maintaining a secondary tracking state path array (recursion stack trace). If a path bumps into an element currently active in the current call stack, a cycle is caught.  
Complexity: Time — O(V + E) | Space — O(V)  
Key Learning: Backtracking active exploration state tracks to guard against directional infinite loops.

---

### 6. Topological Sort
Problem: Linearly sequence the nodes of a Directed Acyclic Graph (DAG) such that for every directed edge $U \rightarrow V$, node $U$ comes before $V$.  
Approach: Deploy Kahn’s Algorithm using a queue to process nodes with an in-degree of 0, or utilize DFS by pushing completed nodes onto a tracking stack.  
Complexity: Time — O(V + E) | Space — O(V)  
Key Learning: Managing strict dependency hierarchies and task scheduling constraints.

---

### 7. Shortest Path (BFS)
Problem: Find the minimum edge distance from a single source vertex to all other vertices in an unweighted graph network.  
Approach: Run a standard BFS sequence. Initialize a primitive distance tracking array where `dist[neighbor] = dist[current] + 1` for each newly exposed neighbor node.  
Complexity: Time — O(V + E) | Space — O(V)  
Key Learning: Transforming expanding queue rings into precise shortest path lengths.

---

### 8. Dijkstra’s Algorithm
Problem: Locate the shortest path metrics spanning from a single source node out across a graph containing non-negative edge weights.  
Approach: Maintain a min-heap (Priority Queue) to continuously greedily select the unvisited vertex holding the absolute smallest tentative distance value, optimizing its surrounding path weights.  
Complexity: Time — O((V + E) \log V) | Space — O(V)  
Key Learning: Minimizing weighted pathways via dynamic priority-sorted exploration trackers.

---

### 9. Number of Islands
Problem: Count the total number of distinct isolated 1-groups (islands) inside a binary 2D grid matrix flanked by water zones (0).  
Approach: Iterate sequentially through the grid coordinates. Upon hitting an unvisited '1', trigger a complete BFS or DFS exploration sweep across its horizontal and vertical connections to wipe that island's state.  
Complexity: Time — O(R * C) | Space — O(R * C)  
Key Learning: Modeling 2D coordinate matrices as implicit graph grids to count disconnected sub-components.

---

### 10. Flood Fill
Problem: Alter the target color value of a specific pixel coordinate in an image matrix along with all its connected same-color neighbors.  
Approach: From the target coordinate, propagate outwards across its four directional neighbors recursively (DFS) or iteratively (BFS), overwriting matching values with the replacement token.  
Complexity: Time — O(R * C) | Space — O(R * C)  
Key Learning: Executing boundary-contained graph expansions within structured boundary grids.
```