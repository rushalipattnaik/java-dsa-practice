package stack;
import java.util.Scanner;

public class ArrayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int n = sc.nextInt();
        int[] stack = new int[n];
        int top = -1;

        while (true) {
            System.out.println("1.Push 2.Pop 3.Peek 4.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                if (top == n - 1) System.out.println("Overflow");
                else stack[++top] = sc.nextInt();
            } else if (choice == 2) {
                if (top == -1) System.out.println("Underflow");
                else System.out.println(stack[top--]);
            } else if (choice == 3) {
                if (top != -1) System.out.println(stack[top]);
            } else break;
        }
        sc.close();
    }
}