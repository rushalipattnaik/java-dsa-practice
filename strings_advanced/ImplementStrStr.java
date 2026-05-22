package strings_advanced;
import java.util.Scanner;

public class ImplementStrStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Haystack (Main String): ");
        String haystack = sc.nextLine();
        System.out.print("Enter Needle (Substring): ");
        String needle = sc.nextLine();

        int index = -1;
        if (needle.isEmpty()) index = 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                index = i;
                break;
            }
        }

        System.out.println("First occurrence index: " + index);
        sc.close();
    }
}