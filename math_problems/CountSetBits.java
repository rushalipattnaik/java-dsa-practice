package math_problems;
import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        // Brian Kernighan’s Algorithm: O(Set Bits)
        
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("Set Bits: " + count);
        sc.close();
    }
}