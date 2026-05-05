package math_problems;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while(temp>0){
            sum += Math.pow(temp % 10, digits);
            temp/=10;
        }
        System.out.println( n == sum? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}
