public import java.util.*;
/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> nodes= new LinkedList<>();
		nodes.add(root);
		while(!nodes.isEmpty())
		{
			BinaryTreeNode<Integer> temp=nodes.remove();
			System.out.print(temp.data+":L:");//+temp.left.data+",R:"+temp.right.data);
			if(temp.left==null)
			System.out.print("-1,R:");
			else
			{
			System.out.print(temp.left.data+",R:");
			nodes.add(temp.left);
			}
			if(temp.right==null)
			{
				System.out.println("-1");
			}
			else
			{
			System.out.println(temp.right.data);
			nodes.add(temp.right);
			
			}
		}
	}
	
} level_order_print_binarytree {
    
}
