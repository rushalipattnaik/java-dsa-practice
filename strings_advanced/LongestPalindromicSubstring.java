package strings_advanced;
import java.util.Scanner;

public class LongestPalindromicSubstring {
    private static int start, maxLen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (s.length() < 2) {
            System.out.println("Longest Palindromic Substring: " + s);
            sc.close();
            return;
        }

        start = 0;
        maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);     // Odd length palindromes
            expandAroundCenter(s, i, i + 1); // Even length palindromes
        }

        System.out.println("Longest Palindromic Substring: " + s.substring(start, start + maxLen));
        sc.close();
    }

    private static void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // length of palindrome discovered is right - left - 1
        if (right - left - 1 > maxLen) {
            start = left + 1;
            maxLen = right - left - 1;
        }
    }
}