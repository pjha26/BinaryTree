import javax.swing.tree.TreeNode;

public class height {
    public int maxDepth(Node root) {
        if( root==null){
            return 0;
        }
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        int height=Math.max(lh,rh)+1;
        return height;
    }
}

