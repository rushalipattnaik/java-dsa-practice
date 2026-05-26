package recursion;
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        System.out.print("Descending (N to 1): ");
        printDescending(n);
        System.out.println();
        
        System.out.print("Ascending (1 to N): ");
        printAscending(n);
        System.out.println();
        sc.close();
    }

    // Tail Recursion: Prints on the way down the call stack
    private static void printDescending(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    // Head Recursion: Prints on the way back up (unwinding)
    private static void printAscending(int n) {
        if (n == 0) return;
        printAscending(n - 1);
        System.out.print(n + " ");
    }
}