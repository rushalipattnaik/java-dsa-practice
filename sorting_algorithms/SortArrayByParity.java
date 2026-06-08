package sorting_algorithms;
import java.util.Scanner;

public class SortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int start = 0, end = n - 1;
        while (start < end) {
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            if (arr[start] % 2 == 0) start++;
            if (arr[end] % 2 != 0) end--;
        }

        System.out.print("Sorted by Parity (Evens First): ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        sc.close();
    }
}