import javax.swing.tree.TreeNode;

public class nodesno {
    public int countNodes(Node root) {
        if(root==null){
          return 0;
        }
        int lh=countNodes(root.left);
        int rh=countNodes(root.right);
        int n=lh+rh+1;
        return n;
    }
}

