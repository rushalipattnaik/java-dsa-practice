package graphs;
import java.util.Scanner;
import java.util.ArrayList;

public class DFSGraph {
    public static void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                dfsUtil(nbr, adj, visited);
            }
        }
    }

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

        boolean[] visited = new boolean[v];
        System.out.print("Enter start vertex for DFS: ");
        int start = sc.nextInt();
        dfsUtil(start, adj, visited);
        System.out.println();
        sc.close();
    }
}