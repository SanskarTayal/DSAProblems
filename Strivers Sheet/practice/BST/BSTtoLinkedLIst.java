public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */
public static LinkedListNode<Integer>head=new LinkedListNode<>(-1);
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
			
			LinkedListNode<Integer> temp=head;
			constructLinked(root);
			return temp.next;
	}
	public static void constructLinked(BinaryTreeNode<Integer>root)
	{
		if(root==null)
		return;
		constructLinked(root.left);
		head.next=new LinkedListNode<Integer>(root.data);
		head=head.next;
		//System.out.print(root.data+" ");
		constructLinked(root.right);
		
		
	}
}