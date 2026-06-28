package trees;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class TreeTraversals {
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
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
        System.out.println("Enter root and child values (Pre-order, use -1 for null):");
        TreeNode root = buildTree(sc);
        
        System.out.print("In-order: "); inorder(root); System.out.println();
        System.out.print("Pre-order: "); preorder(root); System.out.println();
        System.out.print("Post-order: "); postorder(root); System.out.println();
        sc.close();
    }
}