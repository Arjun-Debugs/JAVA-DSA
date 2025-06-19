import java.util.*;
public class SimpleBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            arr[n++] = val;
        }
        TreeNode root = buildTreeFromArray(arr, n, 0);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
    public static TreeNode buildTreeFromArray(int[] arr, int n, int i) {
        if (i >= n) return null;

        TreeNode root = new TreeNode(arr[i]);
        root.left = buildTreeFromArray(arr, n, 2 * i + 1);
        root.right = buildTreeFromArray(arr, n, 2 * i + 2);
        return root;
    }
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}
