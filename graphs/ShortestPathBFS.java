package graphs;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(w);
            adj.get(w).add(u);
        }

        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();

        int[] dist = new int[v];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();

        dist[src] = 0;
        q.add(src);

        while (!q.isEmpty()) {
            int curr = q.remove();
            for (int nbr : adj.get(curr)) {
                if (dist[nbr] == -1) {
                    dist[nbr] = dist[curr] + 1;
                    q.add(nbr);
                }
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.println("Distance from " + src + " to " + i + " is " + dist[i]);
        }
        sc.close();
    }
}