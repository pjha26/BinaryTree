public class sumnodes {
    public int nodSum(Node root){
        if(root==null){
            return 0;
        }
      int ls=nodSum(root.left);
      int rs=nodSum(root.right);
      return rs+ls+root.data;
    }
}
