package searching_algorithms;
import java.util.Scanner;

public class SearchRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rotated sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter rotated sorted elements (e.g., 4 5 6 7 0 1 2):");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        int low = 0, high = n - 1, resultIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                resultIndex = mid;
                break;
            }
            
            // Check if left half is normally sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // Otherwise, right half must be normally sorted
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        System.out.println("Target index: " + resultIndex);
        sc.close();
    }
}