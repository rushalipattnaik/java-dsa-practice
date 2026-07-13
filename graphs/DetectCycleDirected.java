package graphs;
import java.util.Scanner;
import java.util.ArrayList;

public class DetectCycleDirected {
    public static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recStack) {
        visited[node] = true;
        recStack[node] = true;

        for (int nbr : adj.get(node)) {
            if (!visited[nbr]) {
                if (dfs(nbr, adj, visited, recStack)) return true;
            } else if (recStack[nbr]) {
                return true;
            }
        }
        recStack[node] = false;
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
        }

        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        boolean hasCycle = false;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, recStack)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println("Has Directed Cycle: " + hasCycle);
        sc.close();
    }
}