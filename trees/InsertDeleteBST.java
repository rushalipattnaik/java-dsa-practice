package trees;
import java.util.Scanner;

public class InsertDeleteBST {
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    public static TreeNode delete(TreeNode root, int val) {
        if (root == null) return null;
        if (val < root.val) root.left = delete(root.left, val);
        else if (val > root.val) root.right = delete(root.right, val);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = delete(root.right, minNode.val);
        }
        return root;
    }

    private static TreeNode findMin(TreeNode root) {
        while (root.left != null) root = root.left;
        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        while (true) {
            System.out.println("1.Insert 2.Delete 3.Display(Inorder) 4.Exit");
            int choice = sc.nextInt();
            if (choice == 1) root = insert(root, sc.nextInt());
            else if (choice == 2) root = delete(root, sc.nextInt());
            else if (choice == 3) { inorder(root); System.out.println(); }
            else break;
        }
        sc.close();
    }
}