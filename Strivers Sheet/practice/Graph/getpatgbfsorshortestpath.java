import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Solution {
	
	public static void main(String[] args)  throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
		int v= sc.nextInt();
		int e= sc.nextInt();
		int[][] adjmatrix= new int[v][v];
		for(int i=0;i<e;i++)
		{
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			adjmatrix[v1][v2]=1;
			adjmatrix[v2][v1]=1;
		}
		int from =sc.nextInt();
		int to=sc.nextInt();
		findpath(adjmatrix,from,to);
	}
	public static void findpath(int[][] adjmatrix,int from,int to)
	{
		HashMap<Integer,Integer> map= new HashMap<>();
		Queue<Integer> que=new LinkedList<>();
		boolean[] visited=new boolean[adjmatrix.length];
		boolean found=false;
		que.add(from);
		visited[from]=true;
		int parent=-1;
		map.put(from,parent);
		while(!que.isEmpty())
		{
			int cur=que.poll();
			
			for(int i=0;i<adjmatrix.length;i++)
			{
				if(adjmatrix[cur][i]==1&&visited[i]==false)
				{
					que.add(i);
					map.put(i,cur);
					visited[i]=true;
				if(i==to)
				{
					found=true;
					break;
				}
				}
			
				parent=cur;
			
			}
		}
		if(found)
		{
			int cur=to;
			for(Integer i: map.keySet())
			// System.out.println(i+" "+map.get(i));
			while(cur!=-1)
			{
				System.out.print(cur+" ");
				cur=map.get(cur);
			}
		}


	}
}