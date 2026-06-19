package queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers to generate N: ");
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            System.out.print(curr + " ");
            q.add(curr + "0");
            q.add(curr + "1");
        }
        System.out.println();
        sc.close();
    }
}