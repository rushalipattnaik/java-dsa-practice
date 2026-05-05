package math_problems;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        while(n!=0){
            sum += Math.abs(n%10);
            n/=10;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
