import java.util.*;
class Solution{
    public static List<Integer> list=new ArrayList<>();
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root,int k){
      if(root==null)
        return;
        if(root.left==null&&root.right==null&&k==((int)root.data))
        {
            list.add((int)root.data);
            printlist(list);
            list.remove(list.size()-1);
            return;
        }
        
        list.add((int)root.data);
        rootToLeafPathsSumToK(root.left,k-(int)root.data);
        rootToLeafPathsSumToK(root.right,k-(int)root.data);
        
        list.remove(list.size()-1);
    }
    public static void printlist(List<Integer> list)
    {
        for(int i : list)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}