package strings_basics;
import java.util.Scanner;

public class ValidPalindromeAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces/symbols: ");
        String str = sc.nextLine();
        
        int start = 0, end = str.length() - 1;
        boolean isValid = true;
        
        while (start < end) {
            char sChar = str.charAt(start);
            char eChar = str.charAt(end);
            
            if (!Character.isLetterOrDigit(sChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(eChar)) {
                end--;
            } else {
                if (Character.toLowerCase(sChar) != Character.toLowerCase(eChar)) {
                    isValid = false;
                    break;
                }
                start++;
                end--;
            }
        }
        
        System.out.println("Is Valid Palindrome: " + isValid);
        sc.close();
    }
}