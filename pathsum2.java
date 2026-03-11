import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;
import java.util.*;
public class pathsum2 {
      List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> pathSum(Node root, int targetSum) {
         List<Integer> path=new ArrayList<>();
            dfs(root,targetSum,path);
            return result;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer>path){
         if(root==null){
            return ;
         }
         path.add(root.val);
         targetSum=targetSum-root.val;
    if(root.right==null && root.left==null && targetSum==0){
       result.add(new ArrayList<>(path));
    }
 dfs(root.right,targetSum,path);
        dfs(root.left,targetSum,path);
        path.remove(path.size()-1);
    }
}

