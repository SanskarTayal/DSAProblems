public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root==null)
		return;
		int ans=sumofdata(root,0);
		

	}
	public static int sumofdata(BinaryTreeNode<Integer> root,int sum)
	{
		if(root==null)
		return 0;
		int right=sumofdata(root.right,sum);
		int rootdata=root.data;
		root.data=sum+right+root.data;
		
		int left=sumofdata(root.left,root.data);
		return right+left+rootdata;
		



	}
}