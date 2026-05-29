package recursion;
import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("All Permutations:");
        getPermutations(str.toCharArray(), 0);
        sc.close();
    }

    private static void getPermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }
        
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            getPermutations(chars, index + 1);
            swap(chars, index, i); // Backtrack: restore the original position state
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}