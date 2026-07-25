package dynamic_programming;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LIS {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        ArrayList<Integer> sub = new ArrayList<>();
        
        for (int num : nums) {
            int idx = Collections.binarySearch(sub, num);
            if (idx < 0) {
                idx = -(idx + 1);
            }
            if (idx == sub.size()) {
                sub.add(num);
            } else {
                sub.set(idx, num);
            }
        }
        return sub.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println("LIS Length: " + lengthOfLIS(nums));
        sc.close();
    }
}