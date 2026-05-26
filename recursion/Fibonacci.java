package recursion;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth position: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
        sc.close();
    }

    private static int fib(int n) {
        if (n <= 1) return n; // Base cases: fib(0)=0, fib(1)=1
        return fib(n - 1) + fib(n - 2);
    }
}