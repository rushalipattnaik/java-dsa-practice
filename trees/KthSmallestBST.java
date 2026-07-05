package trees;
import java.util.Scanner;

public class KthSmallestBST {
    static int count = 0;
    static int result = -1;

    public static void findKthSmallest(TreeNode root, int k) {
        if (root == null) return;
        findKthSmallest(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        findKthSmallest(root.right, k);
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements for BST: ");
        int n = sc.nextInt();
        TreeNode root = null;
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) root = insert(root, sc.nextInt());

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();
        count = 0;
        result = -1;
        findKthSmallest(root, k);
        System.out.println("Kth Smallest Element: " + result);
        sc.close();
    }
}