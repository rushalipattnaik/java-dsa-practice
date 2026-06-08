package sorting_algorithms;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        // Kth largest corresponds to the (n - k) index in a fully sorted array
        int targetIndex = n - k;
        int result = quickSelect(arr, 0, n - 1, targetIndex);

        System.out.println("The " + k + "th largest element is: " + result);
        sc.close();
    }

    private static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);
            if (pi == k) return arr[pi];
            else if (pi > k) return quickSelect(arr, low, pi - 1, k);
            else return quickSelect(arr, pi + 1, high, k);
        }
        return -1;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    } 
}