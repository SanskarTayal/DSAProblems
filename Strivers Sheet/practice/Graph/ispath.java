import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
       Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter Number of Vertices");
        int v=sc.nextInt();
       // System.out.println("Enter Number of Edges");
        int e=sc.nextInt();
        int[][] adjMatrix= new int[v][v];
        for(int i=0;i<e;i++)
        {
         //   System.out.println("Enter "+(i+1)+"th "+"Nodes");
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v1]=1;
        }
		int from=sc.nextInt();
		int to=sc.nextInt();
		System.out.println(isPath(adjMatrix,from,to));
        sc.close();

	}
	public static boolean isPath(int[][] adjMatrix,int from,int to)
	{
		boolean[] visited = new boolean[adjMatrix.length];
	    return dfs(adjMatrix,from,to,visited);
	}
	public static boolean dfs(int[][] adjMatrix,int from, int to, boolean[] visited)
	{
	//	System.out.println(from);
		if(from==to)
		{
		return true;
		}
		visited[from]=true;
		boolean ans=false;
		for(int i=0;i<adjMatrix.length;i++)
		{
			if(adjMatrix[from][i]==1&&visited[i]==false)
			{
				//System.out.println(from);
				ans=(dfs(adjMatrix,i,to,visited));
				if(ans==true)
				break;
				
			}
		}
		return ans;
	}

}