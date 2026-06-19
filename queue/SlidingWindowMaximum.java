package queue;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter window size K: ");
        int k = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}