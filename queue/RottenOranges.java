package queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grid rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] grid = new int[r][c];
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 2) q.add(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        if (fresh == 0) { System.out.println(0); sc.close(); return; }
        int minutes = 0;
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            minutes++;
            for (int i = 0; i < size; i++) {
                int[] curr = q.remove();
                for (int[] dir : dirs) {
                    int nx = curr[0] + dir[0];
                    int ny = curr[1] + dir[1];
                    if (nx >= 0 && nx < r && ny >= 0 && ny < c && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        fresh--;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        System.out.println(fresh == 0 ? minutes : -1);
        sc.close();
    }
}