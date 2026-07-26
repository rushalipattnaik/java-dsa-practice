package dynamic_programming;
import java.util.Scanner;
import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of denominations: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter coin variations:");
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();
        System.out.print("Enter target amount: ");
        int amount = sc.nextInt();
        
        System.out.println("Minimum coins needed: " + coinChange(coins, amount));
        sc.close();
    }
}