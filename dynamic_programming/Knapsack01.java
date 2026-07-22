package dynamic_programming;
import java.util.Scanner;

public class Knapsack01 {
    public static int knapsack(int W, int[] wt, int[] val, int n) {
        int[] dp = new int[W + 1];
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        System.out.println("Enter values of items:");
        for (int i = 0; i < n; i++) val[i] = sc.nextInt();
        System.out.println("Enter weights of items:");
        for (int i = 0; i < n; i++) wt[i] = sc.nextInt();
        System.out.print("Enter maximum capacity W: ");
        int W = sc.nextInt();
        
        System.out.println("Maximum weight profit: " + knapsack(W, wt, val, n));
        sc.close();
    }
}