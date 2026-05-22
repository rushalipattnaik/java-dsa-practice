package strings_advanced;
import java.util.Scanner;

public class CheckRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        boolean isRotation = (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
        
        System.out.println("Are they rotations of each other? " + isRotation);
        sc.close();
    }
}