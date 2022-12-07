

 

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	public void insert(int data) {
	root=insertHelper(root,data);	
	}
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
		return new BinaryTreeNode<Integer>(data);
		else if(data>root.data)
		root.right=insertHelper(root.right, data);
		else
		root.left=insertHelper(root.left, data);
		return root;
	}
	
	public void remove(int data) {
		root=removeHelper(root,data);
	}
	private static BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
		return null;
		if(root.data==data)
		{
		if(root.left==null&&root.right==null)
		return null;
		else if(root.left==null&&root.right!=null)
		return root.right;
		else if(root.right==null&&root.left!=null)
		return root.left;
		else
		{
			BinaryTreeNode<Integer> temp=root.right;
			while(temp.left!=null)
			{
				temp=temp.left;
			}
			root.data=temp.data;
			root.right = removeHelper(root.right,temp.data);
                return root;
			
		}
		}
		else if(root.data>data)
		root.left=removeHelper(root.left,data);
		else
		root.right=removeHelper(root.right,data);
		return root;
		}
	
	
	public void printTree() {
		//Implement the printTree() function
		printtree(root);
	}
	public static void printtree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		return;
		System.out.print(root.data+":");
		if(root.left!=null)
		System.out.print("L:"+root.left.data+",");
		if(root.right!=null)
		System.out.print("R:"+root.right.data);
		System.out.println("");
		printtree(root.left);
		printtree(root.right);
	}
	
	public boolean search(int data) {
		//boolean ans= searchHelper(root, data);
		return searchHelper(root, data);
	}

	private static boolean searchHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
		return false;
		if(root.data==data)
		return true;
		else if(data>root.data)
		return searchHelper(root.right, data);
		else
		return searchHelper(root.left, data);
	

		
	}
	

}
