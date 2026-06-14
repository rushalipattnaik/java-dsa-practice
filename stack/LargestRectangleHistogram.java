package stack;
import java.util.*;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++) h[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int max = 0, i = 0;
        while (i <= n) {
            int cur = (i == n) ? 0 : h[i];
            if (st.isEmpty() || cur >= h[st.peek()]) st.push(i++);
            else {
                int tp = st.pop();
                max = Math.max(max, h[tp] * (st.isEmpty() ? i : i - st.peek() - 1));
            }
        }
        System.out.println(max);
        sc.close();
    }
}