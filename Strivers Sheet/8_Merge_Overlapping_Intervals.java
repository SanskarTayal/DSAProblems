/*
 * Link to Problem:- https://leetcode.com/problems/merge-intervals/description/
 */
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans =new ArrayList<>();;
        if(intervals.length == 0 || intervals == null ){
            return ans.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       
/*
-> is a operator 
supose we take any 2 elements in an array a,b how we need to compare them and set them is declared here

 */        int x= intervals[0][0];
        int y= intervals[0][1];
        for(int[] i : intervals)
        {
            if(y>=i[0])
            {
                y=Math.max(i[1],y);
                
            }
            else
            {
                ans.add(new int[] {x,y});
                x= i[0];
                y=i[1];
                    
            }
        }
        ans.add(new int[] {x,y});
                 
        return ans.toArray(new int[0][]);
    }
}