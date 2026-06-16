package queue;
import java.util.Scanner;

public class ArrayQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int n = sc.nextInt();
        int[] queue = new int[n];
        int front = 0, rear = 0, size = 0;

        while (true) {
            System.out.println("1.Enqueue 2.Dequeue 3.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                if (size == n) System.out.println("Overflow");
                else {
                    queue[rear++] = sc.nextInt();
                    size++;
                }
            } else if (choice == 2) {
                if (size == 0) System.out.println("Underflow");
                else {
                    System.out.println(queue[front++]);
                    size--;
                }
            } else break;
        }
        sc.close();
    }
}