public class Solution {

    /*	TreeNode structure 
     * 
     * class TreeNode<T> {
            T data;
            ArrayList<TreeNode<T>> children;
    
            TreeNode(T data){
                this.data = data;
                children = new ArrayList<TreeNode<T>>();
            }
        }*/
        
        public static void replaceWithDepthValue(TreeNode<Integer> root){
            root.data=0;
            replaceWithDepthValue(root,0);
        }
        public static void replaceWithDepthValue(TreeNode<Integer> root,int curdepth)
        {
            if(root==null)
            return;
            for(TreeNode<Integer> node : root.children)
            {
                node.data=curdepth+1;
                replaceWithDepthValue(node,curdepth+1);
            }
        
        }
        
        
    }
    