package recursion;
import java.util.Scanner;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Reversed string: " + reverse(str));
        sc.close();
    }

    private static String reverse(String str) {
        if (str.isEmpty()) return str;
        // Take the first character and throw it to the very back of the execution result
        return reverse(str.substring(1)) + str.charAt(0);
    }
}