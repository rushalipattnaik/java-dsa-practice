package basics;
import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;

        for(int i=0; i<n; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
    
}
