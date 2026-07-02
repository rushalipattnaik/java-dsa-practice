package trees;
import java.util.Scanner;

public class LowestCommonAncestor {
    public static TreeNode findLCA(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) return root;
        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
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
        System.out.print("Enter target nodes p and q: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        TreeNode lca = findLCA(root, p, q);
        System.out.println("LCA: " + (lca != null ? lca.val : -1));
        sc.close();
    }
}