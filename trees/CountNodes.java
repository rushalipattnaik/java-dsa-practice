package trees;
import java.util.Scanner;

public class CountNodes {
    public static int count(TreeNode root) {
        if (root == null) return 0;
        return 1 + count(root.left) + count(root.right);
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
        System.out.println("Total Nodes: " + count(root));
        sc.close();
    }
}