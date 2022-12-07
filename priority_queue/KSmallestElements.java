import java.util.*;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		ArrayList<Integer> arr= new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			pq.add(input[i]);
		}
		for(int i=0;i<k;i++)
		{
			arr.add(pq.poll());
		}
		return arr;
	}
}