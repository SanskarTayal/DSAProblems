public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		 return subsets(input,0);

	}
	public static int[][] subsets(int input[], int startindex) {
		if(startindex>=input.length)
		return new int[1][0];
		int[][] recieved =subsets(input,startindex+1);
		int [][] ans = new int[recieved.length*2][];
		int k=0;
		for(int i=0;i<recieved.length;i++)
		{
			ans[i]= new int[recieved[i].length];
			for(int j=0;j<recieved[i].length;j++)
			{
				ans[i][j]=recieved[i][j];
			}
			k++;
		}
		for(int i=0;i<recieved.length;i++)
		{
			ans[k+i]=new int[recieved[i].length+1];
			ans[k+i][0]=input[startindex];
			for(int j=1;j<=recieved[i].length;j++)
			{
				ans[k+i][j]=recieved[i][j-1];
			}
		
		}
		return ans;


	}
}
