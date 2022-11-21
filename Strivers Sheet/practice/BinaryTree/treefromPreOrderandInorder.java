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

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		Map<Integer,Integer> inmap= new HashMap<>();
		for(int i=0;i<inOrder.length;i++)
		{
			inmap.put(inOrder[i],i);
		}
		BinaryTreeNode<Integer> root= buildTree(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length-1,inmap);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int preStart, int preend, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inmap)
	{
		if(preStart>preend||inStart>inEnd) return null;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<>(preOrder[preStart]);
		int inlen=inmap.get(root.data)-inStart;	
		root.left=buildTree(preOrder,preStart+1,preStart+inlen,inOrder,inStart ,inmap.get(root.data)-1,inmap);
		root.right=buildTree(preOrder,preStart+inlen+1,preend,inOrder,inmap.get(root.data)+1,inEnd,inmap);
		return root;

	}

} treefromPreOrderandInorder {
    
}
