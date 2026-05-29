package recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class GenerateSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space-separated elements (e.g. 1 2 3): ");
        String[] tokens = sc.nextLine().split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) arr[i] = Integer.parseInt(tokens[i]);
        
        System.out.println("All Subsets:");
        findSubsets(arr, 0, new ArrayList<>());
        sc.close();
    }

    private static void findSubsets(int[] arr, int index, ArrayList<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        
        // Choice 1: Include the current element
        current.add(arr[index]);
        findSubsets(arr, index + 1, current);
        
        // Backtrack: Remove the element to test clean alternative branch pathways
        current.remove(current.size() - 1);
        
        // Choice 2: Exclude the current element
        findSubsets(arr, index + 1, current);
    }
}