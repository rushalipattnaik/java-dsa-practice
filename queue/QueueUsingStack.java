package queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) return -1;
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStack q = new QueueUsingStack();
        while (true) {
            System.out.println("1.Enqueue 2.Dequeue 3.Exit");
            int choice = sc.nextInt();
            if (choice == 1) q.enqueue(sc.nextInt());
            else if (choice == 2) System.out.println(q.dequeue());
            else break;
        }
        sc.close();
    }
}