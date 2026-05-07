package arrays_basics;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (sorted array): ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("New length: 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        
        System.out.println("New length: " + (i + 1));
        
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }

        sc.close();
    }
}