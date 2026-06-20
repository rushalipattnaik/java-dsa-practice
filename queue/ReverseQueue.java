package queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;
        int x = q.remove();
        reverse(q);
        q.add(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total queue element count: ");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) q.add(sc.nextInt());

        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        sc.close();
    }
}