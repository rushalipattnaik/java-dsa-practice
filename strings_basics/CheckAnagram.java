package strings_basics;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        if (str1.length() != str2.length()) {
            System.out.println("Are Anagrams: false");
            sc.close();
            return;
        }
        
        int[] count = new int[256]; // ASCII Frequency array
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        
        boolean isAnagram = true;
        for (int c : count) {
            if (c != 0) {
                isAnagram = false;
                break;
            }
        }
        
        System.out.println("Are Anagrams: " + isAnagram);
        sc.close();
    }
}