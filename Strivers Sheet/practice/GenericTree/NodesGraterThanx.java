import java.util.*;
public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here	
        if(root==null)
            return 0;
		// Write your code here		
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        //added 1st level here 
        queue.add(root);
        queue.add(null);
		int ans=0;
        
        // if(x<root.data)
        //     ans++;
        
        while(!queue.isEmpty())
        {
            TreeNode<Integer> frontNode = queue.remove();
            if(frontNode == null){
                if(queue.isEmpty()){
                    break;
                }
                
                queue.add(null);
            }else{
               			 if(x<frontNode.data)
           			 		ans++;
                //System.out.print(frontNode.data+" ");
                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }
            
        }
        
        return ans;


	}
	
}