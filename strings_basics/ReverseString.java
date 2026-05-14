package strings_basics;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        char[] chars = str.toCharArray();
        int start = 0, end = chars.length - 1;
        
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        
        System.out.println("Reversed string: " + new String(chars));
        sc.close();
    }
}