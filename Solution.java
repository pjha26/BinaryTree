import javax.swing.tree.TreeNode;
import java.util.*;
public class Solution {
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        dfs(root, targetSum);           // paths starting at this node
        pathSum(root.left, targetSum);  // start from left child
        pathSum(root.right, targetSum); // start from the right child 
        return ans;
    }
    private void dfs(TreeNode node, long target) {
        if (node == null) return;
        if (node.val == target) ans++;
        dfs(node.left, target - node.val);
        dfs(node.right, target - node.val);
    }
}
    
    

