import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */
	public static ArrayList<Integer> ans;
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root==null)
		return null;
		if(root.data==data)
		{
		ans= new ArrayList<Integer>();
		ans.add(data);
		return ans;
		}
		if(root.data>data)
		 ans=getPath(root.left,data);
		if(root.data<data)
		 ans=getPath(root.right,data);
		
		if(ans!=null)
		ans.add(root.data);
		return ans;
	}
}