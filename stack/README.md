# Stack

The stack is a fundamental LIFO (Last-In, First-Out) structure. Mastering stacks is the gateway to understanding function call recursion, browser history, expression parsing, and advanced range-based algorithms like the "Largest Rectangle in Histogram." This module moves from custom implementation to solving complex structural problems.

---

## Problem Set

### 1. Implement Stack Using Array
Problem: Build a stack from scratch using a fixed-size array.  
Approach: Maintain a `top` pointer. Push operations increment the pointer, while pop operations decrement it. Ensure overflow/underflow checks.  
Complexity: Time — O(1) | Space — O(N)  
Key Learning: Managing memory boundaries and index pointers.

---

### 2. Stack Using LinkedList
Problem: Implement a stack using a singly linked list.  
Approach: Push and pop at the `head` of the list to ensure O(1) time complexity. No fixed size constraints.  
Complexity: Time — O(1) | Space — O(N)  
Key Learning: Dynamic memory allocation and pointer manipulation.

---

### 3. Valid Parentheses
Problem: Check if a string has balanced opening and closing brackets.  
Approach: Push opening brackets onto a stack. When a closing bracket arrives, pop and verify if it matches the current top of the stack.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: LIFO state validation for nested structures.

---

### 4. Reverse a String Using Stack
Problem: Reverse a string using the LIFO property.  
Approach: Push all characters onto a stack, then pop them off; the order of extraction is naturally reversed.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Reversing data flow via stack reversal.

---

### 5. Next Greater Element
Problem: For every element in an array, find the next element to its right that is larger.  
Approach: Use a monotonic decreasing stack to store indices. When a larger element is found, pop and store the result.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Monotonic stack pattern for finding relative boundaries.

---

### 6. Min Stack
Problem: Build a stack that supports `push`, `pop`, `top`, and `getMin` in constant $O(1)$ time.  
Approach: Use two stacks—one for the actual data and one to keep track of the current minimum value at each depth.  
Complexity: Time — O(1) | Space — O(N)  
Key Learning: Parallel stack state tracking.

---

### 7. Infix to Postfix
Problem: Convert a mathematical expression from Infix (`A+B`) to Postfix (`AB+`).  
Approach: Use a stack to hold operators. Follow precedence rules to decide when to push or pop operators during the traversal.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Expression parsing and operator precedence handling.

---

### 8. Evaluate Postfix Expression
Problem: Solve a mathematical expression provided in Postfix notation.  
Approach: Scan the expression. If it's a number, push to stack. If it's an operator, pop two operands, compute the result, and push back to stack.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: LIFO-based arithmetic execution.

---

### 9. Largest Rectangle in Histogram
Problem: Find the area of the largest rectangle in a histogram.  
Approach: Use a monotonic stack to find the "nearest smaller element" to the left and right for each bar. The area is `width * height`.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Using monotonic stacks to solve range-based geometric problems. 

---

### 10. Stock Span Problem
Problem: Find the span of a stock's price—the number of consecutive days before the current day where the price was less than or equal to today's price.  
Approach: Use a monotonic decreasing stack to track prices and their indices, popping when a higher price is encountered.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Handling time-series data using monotonic boundary tracking.