import java.util.*;

public class diameter{

    // Define TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diam;
    }

    public Info helper(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = helper(root.left);
        Info rightInfo = helper(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),
                leftInfo.ht + rightInfo.ht);

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter: " + sol.diameterOfBinaryTree(root));
    }
}