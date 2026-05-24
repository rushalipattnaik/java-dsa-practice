package strings_advanced;
import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded string (e.g., 3[a]2[bc]): ");
        String s = sc.nextLine();

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                resStack.push(currentStr);
                currentStr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decoded = resStack.pop();
                int currentK = countStack.pop();
                for (int i = 0; i < currentK; i++) {
                    decoded.append(currentStr);
                }
                currentStr = decoded;
            } else {
                currentStr.append(ch);
            }
        }

        System.out.println("Decoded String: " + currentStr.toString());
        sc.close();
    }
}