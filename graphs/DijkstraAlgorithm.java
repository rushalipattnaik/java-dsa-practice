package graphs;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int v, wt;
    Pair(int v, int wt) { this.v = v; this.wt = wt; }
    public int compareTo(Pair other) { return this.wt - other.wt; }
}

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices and edges: ");
        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());

        System.out.println("Enter u, v, weight for edges:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            int wt = sc.nextInt();
            adj.get(u).add(new Pair(w, wt));
            adj.get(w).add(new Pair(u, wt));
        }

        System.out.print("Enter source: ");
        int src = sc.nextInt();

        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int node = curr.v;
            int d = curr.wt;

            if (d > dist[node]) continue;

            for (Pair edge : adj.get(node)) {
                if (dist[node] + edge.wt < dist[edge.v]) {
                    dist[edge.v] = dist[node] + edge.wt;
                    pq.add(new Pair(edge.v, dist[edge.v]));
                }
            }
        }

        for (int i = 0; i < v; i++) {
            System.out.println("Dist to " + i + " : " + (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]));
        }
        sc.close();
    }
}