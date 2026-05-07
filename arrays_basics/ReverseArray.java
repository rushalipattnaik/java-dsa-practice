package arrays_basics;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0, end= n-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array: ");
        for(int val: arr) System.out.println(val + " ");
        sc.close();
    }
}
