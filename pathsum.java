import javax.swing.tree.TreeNode;
import java.util.*;
public class pathsum {
    public boolean hasPathSum(Node root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.right==null && root.left==null){
            return targetSum==root.data;
        }
   return hasPathSum(root.left, targetSum - root.data) ||
               hasPathSum(root.right, targetSum - root.data);
        }
        
}

