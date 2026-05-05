package math_problems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Perfect");
            sc.close();
            return;
        }

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }

        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect");
        }

        sc.close();
    }
}