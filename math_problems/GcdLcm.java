package math_problems;
import java.util.Scanner;

public class GcdLcm { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = findGCD(a, b);
        long lcm = (long)a*(b/gcd);
        System.out.println("GCD: " + gcd + ", LCM: " + lcm);
        sc.close();
    }
     static int findGCD(int a, int b){
        return b == 0? a : findGCD(b, a%b);
     }
}
