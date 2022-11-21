public class CreateAndInsertDuplicateNode {
    public class Solution{
        public static void insertDuplicateNode(BinaryTreeNode<Integer> root)
        {
            if(root==null)
            return;
           BinaryTreeNode<Integer> copyroot=new BinaryTreeNode<Integer>(root.data);
            BinaryTreeNode<Integer> temp=null; 
           //System.out.println(copyroot.data);
           insertDuplicateNode(root.left);
           //root.left=copyroot;
           insertDuplicateNode(root.right);
           temp=root.left;
           root.left=copyroot;
           root.left.left=temp;
           //System.out.println(copyroot.data);
           return;
        }
        
        }
            
}
