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
		isPath(adjMatrix,from,to);
	}
	public static void isPath(int[][] adjMatrix,int from,int to)
	{
		boolean[] visited = new boolean[adjMatrix.length];
	    ArrayList<Integer> list=dfs(adjMatrix,from,to,visited,null);
		
		if(list==null)
		return;
		list.add(from);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
			
		}
	}
	public static ArrayList<Integer> dfs(int[][] adjMatrix,int from, int to, boolean[] visited,ArrayList<Integer> list)
	{
	
		if(from==to)
		{
		list=new ArrayList<Integer>();
		// list.add(from);
		return list;
		}
		visited[from]=true;
		for(int i=0;i<adjMatrix.length;i++)
		{
			if(adjMatrix[from][i]==1&&visited[i]==false)
			{
				list=dfs(adjMatrix,i,to,visited,list);
				if(list!=null)
				{
					list.add(i);
				    return list;
				}
			}
		}
		return list;
	}
		}

