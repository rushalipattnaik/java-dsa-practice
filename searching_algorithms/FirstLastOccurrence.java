package searching_algorithms;
import java.util.Scanner;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements (duplicates allowed):");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        System.out.println("First Occurrence Index: " + findOccurrence(arr, target, true));
        System.out.println("Last Occurrence Index: " + findOccurrence(arr, target, false));
        sc.close();
    }

    private static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    high = mid - 1; // Keep searching left side
                } else {
                    low = mid + 1;  // Keep searching right side
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}