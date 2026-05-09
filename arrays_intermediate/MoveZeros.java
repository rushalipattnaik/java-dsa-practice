package arrays_intermediate;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int lastNonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = arr[i];
                arr[i] = temp;
                lastNonZeroIndex++;
            }
        }
        for (int i : arr) System.out.print(i + " ");

        sc.close();
    }
    
}