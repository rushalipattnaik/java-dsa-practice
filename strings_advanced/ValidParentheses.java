package strings_advanced;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bracket pattern: ");
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    isValid = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) isValid = false;

        System.out.println("Is Valid Parentheses? " + isValid);
        sc.close();
    }
}