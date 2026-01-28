package basics;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n, rev = 0;

        while(n>0){
            rev = rev * 10 +(n % 10);
            n /= 10;
        }
        System.out.println(original == rev? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
