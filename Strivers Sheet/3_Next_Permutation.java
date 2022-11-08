/* read from end till u fnd the one smaller than previous one
 * replace it with next grater;
 * reverse the remaining array
 */
public class Solution {
    public void nextPermutation(int[] nums) {
    int n= nums.length;
    int k=n-2;
    for(int i=n-1;i>0;i--)
    {
        if(nums[i]<=nums[i-1])
        k--;
        else break;
    }    
    if(k==-1)
    {
        reverse(0,n-1,nums);
        return;
    }
    for(int i=n-1;i>k;i--)
    {
        if(nums[i]>nums[k])
        {
            int temp= nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            break;
        }
    }
        reverse(k+1,n-1,nums);
        return;    

    }
    public static void reverse(int start, int end, int[] nums)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return;
    }
}
