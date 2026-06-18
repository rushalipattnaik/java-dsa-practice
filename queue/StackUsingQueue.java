package queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) return -1;
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingQueue s = new StackUsingQueue();
        while (true) {
            System.out.println("1.Push 2.Pop 3.Exit");
            int choice = sc.nextInt();
            if (choice == 1) s.push(sc.nextInt());
            else if (choice == 2) System.out.println(s.pop());
            else break;
        }
        sc.close();
    }
}