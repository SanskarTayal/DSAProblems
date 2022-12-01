import java.util.*;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
	HashMap<Integer,Integer> map=new HashMap<>();
	int max=Integer.MIN_VALUE;
	for(int i=1;i<arr.length;i++)
	{
		arr[i]=arr[i]+arr[i-1];
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==0)
		max=Math.max(max,i+1);
		if(map.containsKey(arr[i]))
		{
			max=Math.max(i-(map.get(arr[i])),max);

		}
		else
		{
			map.put(arr[i],i);
		}
	}
	return max;
	}
}