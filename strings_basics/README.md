# Strings – Basics

String manipulation is a core skill in technical interviews. This module focuses on character-level operations, frequency counting, and the most common algorithms used to solve string-based problems efficiently.

---

## Problem Set

### 1. Reverse a String
Problem: Reverse the order of characters in a given string.  
Approach: Convert the string to a character array and swap elements using two pointers (start and end).  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: String immutability in Java and in-place character swapping.

---

### 2. Check Palindrome String
Problem: Verify if a string reads the same forwards and backwards.  
Approach: Use two pointers to compare characters from both ends moving inward.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Symmetry checking logic.

---

### 3. Count Vowels & Consonants
Problem: Count the total number of vowels and consonants in a string.  
Approach: Iterate through the string, check if the character is a letter, and categorize it based on a predefined set of vowels (a, e, i, o, u).  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Character categorization and case handling.

---

### 4. Remove Whitespaces
Problem: Remove all spaces from a given string.  
Approach: Use built-in methods like `replaceAll()` or iterate through the string to build a new `StringBuilder` excluding spaces.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Using StringBuilder for efficient string construction.

---

### 5. Convert Lowercase to Uppercase
Problem: Transform all lowercase letters in a string to uppercase without using built-in library functions.  
Approach: Subtract 32 from the ASCII value of each lowercase character.  
Complexity: Time — O(N) | Space — O(N)  
Key Learning: Understanding ASCII values and character encoding.

---

### 6. Check Anagram
Problem: Determine if two strings contain the same characters in a different order (e.g., "listen" and "silent").  
Approach: Sort both strings and compare, or use a frequency array of size 26.  
Complexity: Time — O(N) | Space — O(1) (for the fixed-size frequency array)  
Key Learning: Character frequency mapping.

---

### 7. Find First Non-Repeating Character
Problem: Identify the first character in a string that does not repeat.  
Approach: Use a frequency map (HashMap or array) to count occurrences, then traverse the string a second time to find the first character with a count of 1.  
Complexity: Time — O(N) | Space — O(1) (fixed alphabet size)  
Key Learning: Two-pass algorithms for frequency analysis.

---

### 8. Count Frequency of Characters
Problem: Generate a report of how many times each character appears in the string.  
Approach: Use an integer array of size 256 (ASCII) to store counts based on character index.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Using arrays as lightweight hash maps.

---

### 9. Valid Palindrome (Ignore Cases & Symbols)
Problem: Check if a string is a palindrome, considering only alphanumeric characters and ignoring cases (e.g., "A man, a plan, a canal: Panama").  
Approach: Use two pointers and `Character.isLetterOrDigit()` to skip non-alphanumeric symbols while comparing.  
Complexity: Time — O(N) | Space — O(1)  
Key Learning: Data cleaning and conditional pointer movement.

---

### 10. Longest Common Prefix
Problem: Find the longest common prefix string amongst an array of strings.  
Approach: Horizontal scanning—assume the first string is the prefix and trim it down as you compare it with subsequent strings.  
Complexity: Time — O(S) (S = sum of all characters) | Space — O(1)  
Key Learning: String comparison and `indexOf` logic.