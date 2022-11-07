//my approach
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> columns = new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(Integer i : rows)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=0;
            }
        }
        for(Integer j : columns)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][j]=0;
            }
        }

    }
}

//Optimized Approach
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
	    int n=matrix[0].length;
	    int[] row = new int[m];
	    int[] col = new int[n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            if(matrix[i][j]==0){
	                row[i]=1;
	                col[j]=1;
	            }
	        }
	    }
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            if(row[i]==1||col[j]==1){
	                matrix[i][j]=0;
	            }
	        }
	    }
    }
}