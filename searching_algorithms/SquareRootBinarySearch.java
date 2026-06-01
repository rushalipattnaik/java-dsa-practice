package searching_algorithms;
import java.util.Scanner;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value to find floor square root: ");
        int x = sc.nextInt();
        
        if (x == 0 || x == 1) {
            System.out.println("Square root: " + x);
            sc.close();
            return;
        }
        
        long low = 1, high = x, result = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            
            if (square == x) {
                result = mid;
                break;
            } else if (square < x) {
                result = mid; // mid is a potential floor answer
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println("Floor square root: " + result);
        sc.close();
    }
}