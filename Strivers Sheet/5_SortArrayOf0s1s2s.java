/*
 * leetcode link:- https://leetcode.com/problems/sort-colors/description/
 */
class Solution {
    public void sortColors(int[] nums) {
        int a=0;
      int[] color = new int[3];
      for(int i=0;i<nums.length;i++)
      {
          color[nums[i]]=color[nums[i]]+1;
      }  
      for(int i=0;i<3;i++)
      
      {for(int j=0;j<color[i];j++)
      {
          nums[a]=i;
          a++;
      }
      }
    }
}