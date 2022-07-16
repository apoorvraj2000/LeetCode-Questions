package AllCodes;

public class Out_Of_Boundary_Paths {
	//Memoization Solution
	 int M = 1000000007;
	    public int findPathsM(int m, int n, int maxMove, int startRow, int startColumn) {
	       
	        int memo[][][]=new int[m][n][maxMove+1];
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                for(int k=0;k<=maxMove;k++){
	                    memo[i][j][k]=-1;
	                }
	            }
	        }
	        
	        return helper(m,n,maxMove,startRow,startColumn,memo)%M;
	    }
	    public int helper(int m, int n, int mm, int i, int j, int memo[][][]) {
	        
	       if(i<0 || j<0 || i>=m || j>=n){
	            return 1;
	        }
	        
	         if(mm<=0){
	             return 0;
	         }
	        if(memo[i][j][mm]!=-1){
	            return memo[i][j][mm]%M;
	        }
	        //Go up 
	        //Go down
	        //Go left 
	        //Go right
	        memo[i][j][mm]=((helper(m,n,mm-1,i-1,j,memo)%M + helper(m,n,mm-1,i+1,j,memo)%M)%M +
	                        (helper(m,n,mm-1,i,j-1,memo)%M + helper(m,n,mm-1,i,j+1,memo)%M)%M)%M;
	        
	        return memo[i][j][mm]%M;
	    }
	    
	    
	    
	//Recursive Solution
	public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
	       
        if(startRow<0 || startColumn<0 || startRow==m || startColumn==n){
            return 1;
        }
        
         if(maxMove==0){
             return 0;
         }
        
        int ans=0;
        //go up
        ans+=findPaths(m,n,maxMove-1,startRow-1,startColumn);
        //go down
        ans+=findPaths(m,n,maxMove-1,startRow+1,startColumn);
        //go left
        ans+=findPaths(m,n,maxMove-1,startRow,startColumn-1);
        //go right
        ans+=findPaths(m,n,maxMove-1,startRow,startColumn+1);
        
        return ans%(int)(Math.pow(10,9)+7);
    }
}
