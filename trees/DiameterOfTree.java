package trees;
import java.util.Scanner;

public class DiameterOfTree {
    static int maxDiameter = 0;

    public static int calculateHeight(TreeNode root) {
        if (root == null) return 0;
        int lh = calculateHeight(root.left);
        int rh = calculateHeight(root.right);
        maxDiameter = Math.max(maxDiameter, lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static TreeNode buildTree(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;
        TreeNode root = new TreeNode(val);
        root.left = buildTree(sc);
        root.right = buildTree(sc);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values (Pre-order, use -1 for null):");
        TreeNode root = buildTree(sc);
        maxDiameter = 0;
        calculateHeight(root);
        System.out.println("Diameter: " + maxDiameter);
        sc.close();
    }
}