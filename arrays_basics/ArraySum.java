package arrays_basics;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        
        int sum = 0;

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            sum += sc.nextInt();
        }

        System.out.println("Total sum: " + sum);
        sc.close();
    }   
}
