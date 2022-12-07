public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			
			return SortedArrayToBST(0,n-1,arr);
		}
		public static BinaryTreeNode<Integer> SortedArrayToBST(int start,int end,int[] arr)
		{
			if(start>end)
			return null;
			int mid=(start+end)/2;
			BinaryTreeNode<Integer> head=new BinaryTreeNode<>(arr[mid]);
			head.left=SortedArrayToBST(start,mid-1,arr);
			head.right=SortedArrayToBST(mid+1,end,arr);
			return head;
		}
	