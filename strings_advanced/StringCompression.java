package strings_advanced;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter characters separated by space (e.g., a a b b c): ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        char[] chars = new char[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            chars[i] = tokens[i].charAt(0);
        }

        int index = 0, i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            chars[index++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        System.out.print("Compressed Content: ");
        for (int k = 0; k < index; k++) {
            System.out.print(chars[k] + " ");
        }
        System.out.println("\nNew Length: " + index);
        sc.close();
    }
}