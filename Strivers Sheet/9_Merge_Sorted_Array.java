/*
 * Link:-  https://leetcode.com/problems/merge-sorted-array/submissions/
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
        return;
        if(m==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }
        int ptr1=m-1;
        int ptr2=n-1;
        int i=m+n-1;
        while(ptr1>=0&&ptr2>=0)
        {   
            if(nums1[ptr1]>nums2[ptr2])
            {
               //int temp= nums1[ptr1+ptr2];
               nums1[i]=nums1[ptr1];
             i=i-1;
               ptr1=ptr1-1;
              
            }
            else
            {
                //int temp= nums1[ptr1+ptr2];
               nums1[i]=nums2[ptr2];
               i=i-1;
               //nums2[ptr2]=temp;
               ptr2=ptr2-1;
            }
        }
    }
}