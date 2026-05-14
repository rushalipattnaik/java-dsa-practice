package strings_basics;
import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        
        System.out.println("Without spaces: " + sb.toString());
        sc.close();
    }
}