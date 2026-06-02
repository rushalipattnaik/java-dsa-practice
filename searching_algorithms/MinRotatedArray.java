package searching_algorithms;
import java.util.Scanner;

public class MinRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rotated sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If mid is greater than right, minimum must be in the right half
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else { // Otherwise minimum is at mid or left half
                high = mid;
            }
        }
        
        System.out.println("Minimum Element Value: " + arr[low]);
        sc.close();
    }
}