import java.util.*;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer,Integer> set = new HashMap<>();
		int pairs=0;
		for(int i=0;i<arr.length;i++)
		{
			set.put(arr[i],set.getOrDefault(arr[i],0)+1);
		}
		for(Integer i:set.keySet())
		if(set.containsKey(i+k))
		{
			if(k==0)
			{
				int n=set.get(i);
				int m=n*(n-1);
				pairs=pairs+(m/2);
			}
			else
			{
			pairs=pairs+set.get(i)*set.get(i+k);
			}		
		}
		return pairs;
	}
}