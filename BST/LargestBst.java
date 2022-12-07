public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static class pair{
	int max;
	int min;
	boolean isBst;
	int height;
}

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		pair ans=largestHelper(root);
		return ans.height;
	}
	public static pair largestHelper(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			pair ans=new pair();
			ans.max=Integer.MIN_VALUE;
			ans.min=Integer.MAX_VALUE;
			ans.isBst=true;
			ans.height=0;
			return ans;
		}
		pair left=largestHelper(root.left);
		pair right=largestHelper(root.right);
		pair output = new pair();
		if(left.isBst&&right.isBst&&root.data<right.min&&root.data>left.max)
		{
			output.isBst=true;
			output.height=Math.max(left.height,right.height)+1;
			output.max=Math.max(root.data,Math.max(left.max,right.max));
			output.min=Math.min(root.data,Math.min(left.min,right.min));
		}
		else
		{
			output.isBst=false;
			output.height=Math.max(left.height,right.height);
		}
		return output;


	}

}
