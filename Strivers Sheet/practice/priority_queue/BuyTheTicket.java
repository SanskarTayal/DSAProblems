public import java.util.*;
public class Solution {
	
	public static int buyTicket(int input[], int k) {
		int time=0;
		Queue<Integer> que= new LinkedList<>();
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<input.length;i++)
		{
			que.add(i);
			pq.add(input[i]);
		}
		while(true)
		{
			if(input[que.peek()]==pq.peek())
				{
				if(pq.peek()==input[k])
					{
					if(que.peek()==k)
				 		{
					 		return time+1;
						}
					
						else
						{	
							que.remove();
							time=time+1;
						}
					}	
					else
						{
							time++;
							que.remove();
							pq.remove();
				}
				}
				else
				{
					int temp=que.poll();
					que.add(temp);
				}
			}
}
}

