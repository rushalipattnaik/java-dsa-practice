package arrays_intermediate;
import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int maxSoFar = Integer.MIN_VALUE, currentMax = 0;
        for (int x : arr) {
            currentMax += x;
            if (maxSoFar < currentMax) maxSoFar = currentMax;
            if (currentMax < 0) currentMax = 0;
        }
        System.out.println("Max Subarray Sum: " + maxSoFar);
        sc.close();
    }
}