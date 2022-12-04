import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter Number of Vertices");
        int v=sc.nextInt();
		if(v==0)
		{
			System.out.print("true");
			return;
		}
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
System.out.print(bfsTraversal(adjMatrix));

	}
	private static void bfsTraversal(int[][] adjMatrix,int cu,boolean[] visited) {
		Queue<Integer> que= new LinkedList<>();
		que.add(cu);
		visited[cu]=true;
		while(!que.isEmpty())
		{
			int cur=que.poll();
			
			//System.out.print(cur+" ");
			for(int i=0;i<adjMatrix.length;i++)
			{
				if(adjMatrix[cur][i]==1&&visited[i]==false)
				{
					que.add(i);
					visited[i]=true;
				}
			}

		}
	
        
    }
	private static boolean bfsTraversal(int[][] adjMatrix)
	{
		boolean[] visited=new boolean[adjMatrix.length];
		bfsTraversal(adjMatrix,0,visited);
		
		for(int i=0;i<visited.length;i++)
		{
			if(visited[i]==false)
			{
				return false;
			}
		}
		return true;
	}

}