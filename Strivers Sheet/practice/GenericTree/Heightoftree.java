public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static int getHeight(TreeNode<Integer> root){
		if (root==null)
		return 0;
		int max=0;
		for(int i=0;i<root.children.size();i++)
		{
			max=Math.max(max,getHeight(root.children.get(i)));
		}
		return max+1;
	}

}