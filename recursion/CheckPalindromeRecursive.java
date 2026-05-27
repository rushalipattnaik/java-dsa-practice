package recursion;
import java.util.Scanner;

public class CheckPalindromeRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Is Palindrome: " + isPalindrome(str, 0, str.length() - 1));
        sc.close();
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true; // Base case: crossed middle ground safely
        if (str.charAt(start) != str.charAt(end)) return false;
        
        return isPalindrome(str, start + 1, end - 1);
    }
}