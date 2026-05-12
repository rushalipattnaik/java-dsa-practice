package arrays_intermediate;
import java.util.Scanner;

public class ContainerMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0; i<n; i++) height[i] = sc.nextInt();

        int left = 0, right = n - 1, maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        System.out.println("Max Water Area: " + maxArea);
        sc.close();
    }
}