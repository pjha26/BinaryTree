import javax.swing.tree.TreeNode;
import java.util.*;
public class leet106{
    int postIndex;
    public Node buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return helper(inorder, postorder, 0, inorder.length - 1);
    }
    public TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd){
        if(inStart > inEnd){
            return null;
        }
        int rootVal = postorder[postIndex--];
        TreeNode root = new Node(rootVal);
        int rootIndex = inStart;
        while(inorder[rootIndex] != rootVal){
            rootIndex++;
        }
        root.right = helper(inorder, postorder, rootIndex + 1, inEnd);
        root.left  = helper(inorder, postorder, inStart, rootIndex - 1);
        return root;
    }
}
    
 
    

