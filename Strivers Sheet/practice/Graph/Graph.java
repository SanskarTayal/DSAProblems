package practice.Graph;
import java.util.*;


public class Graph {
    public static void dfsTraversal(int[][] matrix)
    {
        boolean[] visited=new boolean[matrix.length];
        dfsTraversal(matrix,0,visited);
        System.out.println();
    }
    public static void dfsTraversal(int[][] matrix,int cur,boolean[] visited)
    {
        visited[cur]=true;
        
        System.out.print(cur+" ");
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[cur][i]==1&&visited[i]==false)
            {
                dfsTraversal(matrix,i,visited);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Vertices");
        int v=sc.nextInt();
        System.out.println("Enter Number of Edges");
        int e=sc.nextInt();
        int[][] adjMatrix= new int[v][v];
        for(int i=0;i<e;i++)
        {
            System.out.println("Enter "+(i+1)+"th "+"Nodes");
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            adjMatrix[v1][v2]=1;
            adjMatrix[v2][v1]=1;
        }
        for(int i=0;i<e;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        dfsTraversal(adjMatrix);
        bfsTraversal(adjMatrix);

    }
    private static void bfsTraversal(int[][] adjMatrix,int cu,boolean[] visited) {
		Queue<Integer> que= new LinkedList<>();
		que.add(cu);
		visited[cu]=true;
		while(!que.isEmpty())
		{
			int cur=que.poll();
			
			System.out.print(cur+" ");
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
	private static void bfsTraversal(int[][]adjMatrix)
	{
		boolean[] visited=new boolean[adjMatrix.length];
		for(int i=0;i<visited.length;i++)
		{
			if(visited[i]==false)
			{
				bfsTraversal(adjMatrix,i,visited);
			}
		}
	}
}
