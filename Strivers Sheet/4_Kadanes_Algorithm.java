/*
 * Link:- https://leetcode.com/problems/maximum-subarray/description/
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            cursum=cursum+nums[i];
            if(nums[i]>cursum)
            {
                cursum=nums[i];
            } 
            maxsum=Math.max(cursum,maxsum);

        }
        return maxsum;
    }
}