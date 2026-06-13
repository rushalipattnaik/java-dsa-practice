package stack;
import java.util.*;

public class InfixToPostfix {
    static int prec(char c) { return (c == '+' || c == '-') ? 1 : (c == '*' || c == '/') ? 2 : (c == '^') ? 3 : -1; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) res.append(c);
            else if (c == '(') st.push(c);
            else if (c == ')') { while (st.peek() != '(') res.append(st.pop()); st.pop(); }
            else { while (!st.isEmpty() && prec(c) <= prec(st.peek())) res.append(st.pop()); st.push(c); }
        }
        while (!st.isEmpty()) res.append(st.pop());
        System.out.println(res);
        sc.close();
    }
}