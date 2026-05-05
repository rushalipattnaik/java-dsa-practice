package math_problems;
import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        
        // Legendre's Formula: O(log5 N)
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        System.out.println("Trailing Zeros: " + count);
        sc.close();
    }
}