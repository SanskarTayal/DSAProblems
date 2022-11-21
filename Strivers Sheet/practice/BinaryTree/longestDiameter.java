public /*
	
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
import java.util.*;
public class Solution {

public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
   if (root == null) return 0;
    int option_1 = height(root.left) + height(root.right)+1;
    int option_2 = diameterOfBinaryTree(root.left);
    int option_3 = diameterOfBinaryTree(root.right);

    return Math.max(option_1, Math.max(option_2, option_3));
}
public static int height(BinaryTreeNode root)
{
    if(root==null)
    return 0;
    return 1+Math.max(height(root.left),height(root.right));
}
}




















longestDiameter {
    
}
