package graphs;
import java.util.Scanner;
import java.util.ArrayList;

public class DetectCycleUndirected {
    public static boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                if (dfs(nbr, node, adj, visited)) return true;
            } else if (nbr != parent) {
                return true;
            }
        }
        return false;
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
        boolean hasCycle = false;
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("Has Cycle: " + hasCycle);
        sc.close();
    }
}