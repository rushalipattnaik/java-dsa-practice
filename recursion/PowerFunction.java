package recursion;
import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        
        System.out.println(x + "^" + n + " = " + power(x, n));
        sc.close();
    }

    private static double power(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) { // Handle negative powers
            x = 1 / x;
            n = -n;
        }
        
        double half = power(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}