package recursion;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        
        shiftDisks(n, 'A', 'C', 'B'); // A = Source, C = Destination, B = Auxiliary
        sc.close();
    }

    private static void shiftDisks(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        shiftDisks(n - 1, source, auxiliary, destination);
        

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        
        shiftDisks(n - 1, auxiliary, destination, source);
    }
}