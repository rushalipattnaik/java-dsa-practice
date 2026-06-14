package stack;
import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0; i<n; i++) p[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && p[st.peek()] <= p[i]) st.pop();
            System.out.print((st.isEmpty() ? i + 1 : i - st.peek()) + " ");
            st.push(i);
        }
        sc.close();
    }
}