package AllCodes;

public class Minimum_Path_Sum {
	 public int minPathSum(int[][] grid) {
	        int m=grid.length;
	        int n=grid[0].length;
	        int[][] dp=new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                dp[i][j]=-1;
	            }
	        }
	        return helper(grid,0,0,dp);
	    }
	    public static int helper(int[][] input, int i, int j, int dp[][]) {
			if(i==input.length-1 && j==input[0].length-1){
	            dp[i][j]=input[i][j];
	            return dp[i][j];
	        }
	        
	        if(i>=input.length || j>=input[0].length)
	            return Integer.MAX_VALUE;
	        
	        //check if current cell ans is already calculated or not
	        if(dp[i][j]!=-1){
	            return dp[i][j];
	        }
	        
	        //Go down
	        int option1=helper(input,i+1,j,dp);
	       
	        //Go right
	        int option2=helper(input,i,j+1,dp);
	        
	        //Add current and minimum of all three option
	        int ans=input[i][j]+Math.min(option1,option2);
	        //add current cell ans into dp array
	        dp[i][j]=ans;
	        
	        return dp[i][j];
		}
}
