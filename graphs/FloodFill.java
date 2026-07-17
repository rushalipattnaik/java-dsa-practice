package graphs;
import java.util.Scanner;

public class FloodFill {
    public static void dfs(int r, int c, int[][] image, int oldColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oldColor) {
            return;
        }
        image[r][c] = newColor;
        dfs(r + 1, c, image, oldColor, newColor);
        dfs(r - 1, c, image, oldColor, newColor);
        dfs(r, c + 1, image, oldColor, newColor);
        dfs(r, c - 1, image, oldColor, newColor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter image dimensions (rows, columns): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] image = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter starting row, col and new color value: ");
        int sr = sc.nextInt();
        int scCoord = sc.nextInt();
        int newColor = sc.nextInt();

        int oldColor = image[sr][scCoord];
        if (oldColor != newColor) {
            dfs(sr, scCoord, image, oldColor, newColor);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}