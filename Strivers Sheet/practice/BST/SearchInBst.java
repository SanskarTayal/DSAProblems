class Solution{
    public static boolean searchInBST(BinaryTreeNode root,int k)
    {
        if(root==null)
        return false;
        if(k==(int)root.data)
        {
            return true;
        }
        if(k<(int)root.data)
        {
            return searchInBST(root.left,k);
        }
        if(k>(int)root.data)
        {
            return searchInBST(root.right,k);
        }
        return false;
    }
}
