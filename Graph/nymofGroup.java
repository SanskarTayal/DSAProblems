public class Solution {

	public static int numConnected(int[][] edges, int n) {
        boolean[] visited=new boolean[edges.length];
		int group=0;
		for(int i=0;i<edges.length;i++)
		{
			
			if(visited[i]==false)
			{
				dfs(edges,visited,i);
			group++;
			}
		}
		return group;
	}
	public static void dfs(int[][] edges, boolean[] visited, int cur)
	{
		visited[cur]=true;
		for(int i=0;i<edges.length;i++)
		{
			if(edges[cur][i]==1&&visited[i]==false)
			{
				
				dfs(edges,visited,i);
			}
		}

	}


}