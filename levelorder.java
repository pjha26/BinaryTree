import java.util.LinkedList;
import java.util.Queue;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class levelorder{
public static void levelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
        Node curNode = q.remove();
        if(curNode == null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }

        }else{
            System.out.print(curNode.data + " ");
            if(curNode.left != null){
                q.add(curNode.left);
            }
            if(curNode.right != null){
                q.add(curNode.right);
            }
        }
    }
}
}