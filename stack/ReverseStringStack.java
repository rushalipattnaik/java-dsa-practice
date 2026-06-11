package stack;
import java.util.*;

public class ReverseStringStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) st.push(c);
        while (!st.isEmpty()) System.out.print(st.pop());
        sc.close();
    }
}