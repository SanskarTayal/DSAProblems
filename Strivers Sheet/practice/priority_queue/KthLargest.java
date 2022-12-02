import java.util.*;
public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();	
		for(int i=0;i<n;i++)
		{
			pq.add(input[i]);
		}
		for(int i=0;i<n-k;i++)
		{
			pq.remove();
		}
		return pq.poll();

	}
}