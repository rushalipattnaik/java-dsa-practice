package stack;
import java.util.*;

public class EvaluatePostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) st.push(c - '0');
            else {
                int b = st.pop(), a = st.pop();
                if (c == '+') st.push(a + b); else if (c == '-') st.push(a - b);
                else if (c == '*') st.push(a * b); else st.push(a / b);
            }
        }
        System.out.println(st.pop());
        sc.close();
    }
}