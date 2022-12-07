public class Solution {
	public static void printPostOrder(TreeNode<Integer> root){
		for(TreeNode node:root.children)
			printPostOrder(node);
		System.out.print(root.data+" ");
	}
}