package dynamic_programming;
import java.util.Scanner;

public class MatrixChainMultiplication {
    public static int matrixMultiplication(int[] p, int n) {
        int[][] dp = new int[n][n];
        
        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + p[i - 1] * p[k] * p[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of dimensions array: ");
        int n = sc.nextInt();
        int[] p = new int[n];
        System.out.println("Enter dimensions matrix order parameters:");
        for (int i = 0; i < n; i++) p[i] = sc.nextInt();
        
        System.out.println("Minimum multi operation cost: " + matrixMultiplication(p, n));
        sc.close();
    }
}