package sorting_algorithms;
import java.util.*;

public class MinimumSwapsToSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array (unique integers): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter distinct elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Map elements to their initial position indexes
        ArrayList<Pair> arrPos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrPos.add(new Pair(arr[i], i));
        }

        // Sort elements by value to know where they should eventually go
        arrPos.sort(Comparator.comparingInt(a -> a.value));

        boolean[] visited = new boolean[n];
        int ansSwaps = 0;

        for (int i = 0; i < n; i++) {
            // If already processed or element is already in correct placement position
            if (visited[i] || arrPos.get(i).index == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrPos.get(j).index; // Move to next node in the swap cycle link
                cycleSize++;
            }

            if (cycleSize > 0) {
                ansSwaps += (cycleSize - 1);
            }
        }

        System.out.println("Minimum swaps required to sort: " + ansSwaps);
        sc.close();
    }

    static class Pair {
        int value, index;
        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}