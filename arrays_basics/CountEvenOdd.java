package arrays_basics;
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int even = 0, odd = 0;

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            if(val%2==0) even++;
            else odd++;
        }
        System.out.println("Even: "+even + "Odd: "+odd);
        sc.close();
    }
}
