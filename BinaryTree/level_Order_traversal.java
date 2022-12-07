import java.util.*;
class Solution{

    public static void printLevelWise(BinaryTreeNode<Integer> root)
    {
        
        Queue<BinaryTreeNode<Integer>> que=new LinkedList<>();
        que.add(root);
         que.add(null);
        while(!que.isEmpty())
        {
            BinaryTreeNode<Integer> temp=que.remove();
    
            if(temp==null)
            {
                  System.out.println("");
                if(!que.isEmpty()){
                     que.add(null);
                }
                continue;
             }
            System.out.print(temp.data+" ");
           if(temp.left!=null)
            que.add(temp.left);
            if(temp.right!=null)
            que.add(temp.right);
            
        }
    }
}public class level_Order_traversal {
    
}
