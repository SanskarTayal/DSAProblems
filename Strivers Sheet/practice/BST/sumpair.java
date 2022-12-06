import java.util.*;
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
	public static HashSet<BinaryTreeNode<Integer>> set;
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		set=new HashSet<>();
		printNodesSumToS(root,s,root);
	}
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s,BinaryTreeNode<Integer> master) {
		if(root==null)
		return;
		if(contains(master,s-root.data)&&!set.contains(root))
		{
			
			if(root.data>(s-root.data))
			System.out.println((s-root.data)+" "+root.data);
			else
			System.out.println(root.data+" "+(s-root.data));
			
		}
		set.add(root);
		printNodesSumToS(root.left,s,master);
		printNodesSumToS(root.right,s,master);

	}
	public static boolean contains(BinaryTreeNode<Integer> root, int n)
	{
		if(root==null)
		return false;
		if(root.data==n)
		{
			set.add(root);
		return true;
		}
		if(n>root.data)
		return contains(root.right,n);
		return contains(root.left,n);
		
	}

}