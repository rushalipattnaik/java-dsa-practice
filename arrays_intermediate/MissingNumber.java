package arrays_intermediate;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n is the range [0, n]
        int[] arr = new int[n];
        int actualSum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }
        int expectedSum = n * (n + 1) / 2;
        System.out.println("Missing Number: " + (expectedSum - actualSum));
        sc.close();
    }
}