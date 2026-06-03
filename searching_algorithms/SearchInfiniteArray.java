package searching_algorithms;
import java.util.Scanner;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Simulating an infinite array with a large regular array for runtime purposes
        System.out.print("Enter array limit size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        
        // Step 1: Establish boundaries exponentially
        int low = 0;
        int high = 1;
        
        try {
            while (arr[high] < target) {
                low = high;
                high = high * 2; // Double the bounds window
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Adjust upper limit safely if simulated boundary is crossed
            high = size - 1;
        }
        
        // Step 2: Normal Binary Search over located window interval bounds
        int resultIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                resultIndex = mid;
                break;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        
        System.out.println("Index of target: " + resultIndex);
        sc.close();
    }
}