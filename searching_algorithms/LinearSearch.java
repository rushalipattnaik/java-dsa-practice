package searching_algorithms;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        
        int resultIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                resultIndex = i;
                break;
            }
        }
        
        System.out.println("Target found at index: " + resultIndex);
        sc.close();
    }
}