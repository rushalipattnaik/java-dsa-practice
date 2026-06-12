package stack;
import java.util.*;

public class MinStack {
    Stack<Integer> s = new Stack<>(), m = new Stack<>();

    public void push(int x) {
        s.push(x);
        if (m.isEmpty() || x <= m.peek()) m.push(x);
    }

    public void pop() {
        if (!s.isEmpty()) {
            if (s.pop().equals(m.peek())) m.pop();
        }
    }

    public int top() {
        return s.isEmpty() ? -1 : s.peek();
    }

    public int getMin() {
        return m.isEmpty() ? -1 : m.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack ms = new MinStack();
        
        while (true) {
            System.out.println("1.Push 2.Pop 3.Top 4.GetMin 5.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                ms.push(sc.nextInt());
            } else if (choice == 2) {
                ms.pop();
            } else if (choice == 3) {
                System.out.println(ms.top());
            } else if (choice == 4) {
                System.out.println(ms.getMin());
            } else break;
        }
        sc.close();
    }
}