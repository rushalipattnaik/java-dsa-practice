# Mathematical Problems & Logic

This module focuses on essential mathematical algorithms and logic-based problems. These include number theory, primality testing, and bit manipulation—concepts that are fundamental for optimizing code in competitive programming.

---

## Problem Set

### 1. Check Prime Number
Problem: Determine whether a given number N is prime or not.  
Approach: Iterate from 2 to √N. If any number divides N, it is not prime.  
Complexity: Time — O(√N) | Space — O(1)  
Key Learning: Primality testing and loop optimization.

---

### 2. Print All Primes up to N
Problem: List all prime numbers from 1 to N.  
Approach: Use a nested loop or the Sieve of Eratosthenes algorithm.  
Complexity: Time — O(N√N) | Space — O(1)  
Key Learning: Efficiently handling multiple primality checks.

---

### 3. Count Digits
Problem: Count the total number of digits in an integer N.  
Approach: Use a while loop to divide the number by 10 until it becomes zero.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Extracting digits and understanding logarithmic growth.

---

### 4. Sum of Digits
Problem: Calculate the sum of all digits in a given number.  
Approach: Use the modulo operator (%) to get each digit and add it to a sum variable.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Digit-based arithmetic operations.

---

### 5. Armstrong Number
Problem: Check if a number equals the sum of its digits raised to the power of the count of digits.  
Approach: Extract each digit, raise it to the power, and sum them up.  
Complexity: Time — O(log N) | Space — O(1)  
Key Learning: Using Math.pow() and number reconstruction.

---

### 6. GCD & LCM
Problem: Find the Greatest Common Divisor and Least Common Multiple of two numbers.  
Approach: Use the Euclidean Algorithm for GCD and the formula (a * b) / GCD for LCM.  
Complexity: Time — O(log(min(a,b))) | Space — O(1)  
Key Learning: Implementing the Euclidean algorithm and basic number theory.

---

### 7. Power of a Number
Problem: Calculate the value of a raised to the power b (a^b).  
Approach: Use a loop to multiply 'a', 'b' times, or use Binary Exponentiation.  
Complexity: Time — O(b) | Space — O(1)  
Key Learning: Handling exponents and large results.

---

### 8. Perfect Number
Problem: Determine if a number is equal to the sum of its proper divisors.  
Approach: Find all divisors of N up to N/2 and check if their sum equals N.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Divisor identification and sum accumulation.

---

### 9. Trailing Zeros in Factorial
Problem: Find the number of trailing zeros in N! without calculating the full factorial.  
Approach: Count the number of times 5 is a factor in numbers from 1 to N.  
Complexity: Time — O(log₅ N) | Space — O(1)  
Key Learning: Prime factorization logic and Legendre's formula.

---

### 10. Count Set Bits
Problem: Count the number of 1s in the binary representation of an integer.  
Approach: Use Brian Kernighan’s algorithm (n & (n-1)) to count set bits efficiently.  
Complexity: Time — O(Set Bits) | Space — O(1)  
Key Learning: Bitwise operators and binary manipulation.