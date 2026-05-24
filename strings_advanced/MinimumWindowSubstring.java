package strings_advanced;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string S: ");
        String s = sc.nextLine();
        System.out.print("Enter string T: ");
        String t = sc.nextLine();

        int[] targetMap = new int[256];
        for (char c : t.toCharArray()) targetMap[c]++;

        int[] windowMap = new int[256];
        int left = 0, minLen = Integer.MAX_VALUE, startIndex = -1;
        int count = 0; // counts valid matched characters

        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            windowMap[rChar]++;

            if (targetMap[rChar] > 0 && windowMap[rChar] <= targetMap[rChar]) {
                count++;
            }

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char lChar = s.charAt(left);
                windowMap[lChar]--;
                if (targetMap[lChar] > 0 && windowMap[lChar] < targetMap[lChar]) {
                    count--;
                }
                left++;
            }
        }

        String result = (startIndex == -1) ? "" : s.substring(startIndex, startIndex + minLen);
        System.out.println("Minimum Window Substring: \"" + result + "\"");
        sc.close();
    }
}