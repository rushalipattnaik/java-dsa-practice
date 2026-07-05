package graphs;
import java.util.Scanner;
import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices and edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());

        System.out.println("Enter endpoints for " + e + " edges:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(w);
            adj.get(w).add(u);
        }

        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int nbr : adj.get(i)) {
                System.out.print(nbr + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}