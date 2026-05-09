package arrays_intermediate;
import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0; i<n; i++) { arr1[i] = sc.nextInt(); set.add(arr1[i]); }
        
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
            if(set.contains(arr2[i])) {
                intersection.add(arr2[i]);
                set.remove(arr2[i]); // Avoid duplicates in intersection
            }
            set.add(arr2[i]); // Add all to set for Union
        }
        System.out.println("Union Size: " + set.size());
        System.out.println("Intersection: " + intersection);
        sc.close();
    }
}
