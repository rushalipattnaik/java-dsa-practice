package strings_basics;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        System.out.println("Character frequencies:");
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] != 0) {
                System.out.println(str.charAt(i) + " : " + freq[str.charAt(i)]);
                freq[str.charAt(i)] = 0; // Prevent repeating output for duplicate elements
            }
        }
        sc.close();
    }
}