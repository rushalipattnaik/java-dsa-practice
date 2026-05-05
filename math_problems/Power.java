package math_problems;
import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double base = sc.nextDouble();
        int exp = sc.nextInt();
        double res = 1;

        for(int i=0; i<Math.abs(exp); i++) res *= base;
        System.out.println(exp<0 ? 1 / res : res);
        sc.close();
    }
}
