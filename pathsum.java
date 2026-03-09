import javax.swing.tree.TreeNode;
import java.util.*;
public class pathsum {
    public boolean hasPathSum(Node root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.right==null && root.left==null){
            return targetSum==root.val;
        }
   return hasPathSum(root.left, targetSum - ) ||
               hasPathSum(root.right, targetSum - root.val);
        }
        
}

