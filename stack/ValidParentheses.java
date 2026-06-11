package stack;
import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        boolean ok = true;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') st.push(c);
            else if (st.isEmpty() || (c == ')' && st.pop() != '(') || (c == '}' && st.pop() != '{') || (c == ']' && st.pop() != '[')) { ok = false; break; }
        }
        System.out.println(ok && st.isEmpty());
        sc.close();
    }
}