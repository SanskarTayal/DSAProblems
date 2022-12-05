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
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root.data==x)
        return true;
        for(TreeNode node : root.children)
        {
           boolean ans=checkIfContainsX(node,x);
           if(ans)
           return true;
        }
        return false;
	}
	
}
