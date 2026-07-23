package dynamic_programming;
import java.util.Scanner;

public class SubsetSum {
    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                if (dp[j - arr[i]]) {
                    dp[j] = true;
                }
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();
        
        System.out.println("Subset with target sum exists: " + isSubsetSum(arr, n, sum));
        sc.close();
    }
}