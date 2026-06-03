package searching_algorithms;
import java.util.Scanner;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] pages = new int[n];
        
        int maxPages = 0, sumPages = 0;
        System.out.println("Enter pages for each book:");
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
            maxPages = Math.max(maxPages, pages[i]);
            sumPages += pages[i];
        }
        
        System.out.print("Enter number of students: ");
        int m = sc.nextInt();
        
        if (m > n) {
            System.out.println("Allocation impossible: -1");
            sc.close();
            return;
        }
        
        int low = maxPages, high = sumPages, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isAllocationFeasible(pages, m, mid)) {
                result = mid;     // mid is achievable, try to find a smaller maximum
                high = mid - 1;
            } else {
                low = mid + 1;    // mid is too small, increase limit threshold
            }
        }
        
        System.out.println("Minimum possible value of maximum pages: " + result);
        sc.close();
    }

    private static boolean isAllocationFeasible(int[] pages, int students, int maxAllowed) {
        int studentCount = 1, currentAllocatedPages = 0;
        
        for (int page : pages) {
            if (currentAllocatedPages + page <= maxAllowed) {
                currentAllocatedPages += page;
            } else {
                studentCount++;
                currentAllocatedPages = page;
                if (studentCount > students) return false;
            }
        }
        return true;
    }
}