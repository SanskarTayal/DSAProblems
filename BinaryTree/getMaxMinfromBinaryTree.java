//my code
import java.util.*;
class Solution{
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode root)
    {
        return new Pair<Integer, Integer>(getmin(root,Integer.MAX_VALUE),getmax(root,Integer.MIN_VALUE));
    }
    public static int getmin(BinaryTreeNode root,int min)
    {
        if(root==null)
        return min;
        int data=(int)root.data;
        min=Math.min(data,min);
        int left=getmin(root.left,min);
        int right=getmin(root.right,min);
        return Math.min(left,right);

    }
    public static int getmax(BinaryTreeNode root,int max)
    {
        if(root==null)
        return max;
        int data=(int)root.data;
        max=Math.max(data,max);
        int left=getmax(root.left,max);
        int right=getmax(root.right,max);
        return Math.max(left,right);

    }
}

//optimal code
public class Solution { public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) { 
    if (root == null) {
     return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE); } 
Pair<Integer, Integer> leftPair = getMinAndMax(root.left); 
Pair<Integer, Integer> rightPair = getMinAndMax(root.right); 
int minimum = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
 int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum)); 
return new Pair<>(minimum, maximum); } }

