package searching_algorithms;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        
        int low = 0, high = n - 1, resultIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow
            
            if (arr[mid] == target) {
                resultIndex = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println("Target found at index: " + resultIndex);
        sc.close();
    }
}