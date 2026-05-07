package arrays_basics;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int x : arr) {
            if(x > largest) {
                second = largest;
                largest = x;
            } else if(x > second && x != largest) {
                second = x;
            }
        }
        System.out.println("Second Largest: " + (second == Integer.MIN_VALUE ? "None" : second));
        sc.close();
    }
}