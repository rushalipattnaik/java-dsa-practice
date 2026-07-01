package trees;
import java.util.Scanner;

public class CheckBalancedTree {
    public static int checkBalance(TreeNode root) {
        if (root == null) return 0;
        int lh = checkBalance(root.left);
        if (lh == -1) return -1;
        int rh = checkBalance(root.right);
        if (rh == -1) return -1;
        
        if (Math.abs(lh - rh) > 1) return -1;
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
        System.out.println("Is Balanced: " + (checkBalance(root) != -1));
        sc.close();
    }
}