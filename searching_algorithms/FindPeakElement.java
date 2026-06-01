package searching_algorithms;
import java.util.Scanner;

public class FindPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            // If descending slope pattern, peak is on the left (including mid)
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else { // Ascending slope, peak is on the right
                low = mid + 1;
            }
        }
        
        System.out.println("Peak element found at index: " + low + " (Value: " + arr[low] + ")");
        sc.close();
    }
}