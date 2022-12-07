
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
        
        public static TreeNode<Integer> maxsum;
        public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
            maxSumNodehelp(root);
    
            return findmax(root,maxsum);
            }
        public static void maxSumNodehelp(TreeNode<Integer> root)
        {
            for(TreeNode<Integer> node : root.children)
            {
                maxSumNodehelp(node);
                maxsum=findmax(maxsum,node);
                
            }
        }
        public static TreeNode<Integer> findmax(TreeNode<Integer> a,TreeNode<Integer> b)
        {
            if(a==null)
            return b;
            int sum1=a.data;
            int sum2=b.data;
            for(TreeNode<Integer> node : a.children)
            {
                sum1+=node.data;
            }
            for(TreeNode<Integer> node : b.children)
            {
                sum2+=node.data;
            }
            if(sum1>sum2)
            return a;
            return b;
        }
        
            
    }
    