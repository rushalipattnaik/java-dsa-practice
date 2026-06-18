package queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string stream: ");
        String s = sc.next();
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            q.add(c);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) System.out.print("# ");
            else System.out.print(q.peek() + " ");
        }
        System.out.println();
        sc.close();
    }
}