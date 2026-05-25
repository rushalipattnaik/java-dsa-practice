package strings_advanced;
import java.util.Scanner;

public class MultiplyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number string 1: ");
        String num1 = sc.nextLine();
        System.out.print("Enter positive number string 2: ");
        String num2 = sc.nextLine();

        if (num1.equals("0") || num2.equals("0")) {
            System.out.println("Product: 0");
            sc.close();
            return;
        }

        int n1 = num1.length(), n2 = num2.length();
        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : result) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }

        System.out.println("Product: " + sb.toString());
        sc.close();
    }
}