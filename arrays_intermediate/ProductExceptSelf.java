package arrays_intermediate;
import java.util.Scanner;

public class ProductExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n], res = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int left = 1;
        for (int i = 0; i < n; i++) {
            res[i] = left;
            left *= arr[i];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= arr[i];
        }
        for (int val : res) System.out.print(val + " ");
        sc.close();
    }
}