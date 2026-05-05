package math_problems;
import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            if(isPrime(i)) System.out.println(i + " ");
        }
        sc.close();

    }
    static boolean isPrime(int n){
        if (n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true; 
    }
}
