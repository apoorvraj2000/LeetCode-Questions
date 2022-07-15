package AllCodes;

public class Max_Area_of_Island {
	public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int op=helper(i,j,grid);
                    ans=Math.max(ans,op);
                }
            }
        }
        return ans;
    }
    private int helper(int i, int j, int [][]grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]<1)
            return 0;
        
        grid[i][j]=-1;
        //go up
        int op1=helper(i-1,j,grid);
        //go down    
        int op2=helper(i+1,j,grid);
        //go left
        int op3=helper(i,j-1,grid);
        //go right
        int op4=helper(i,j+1,grid);
        
        return 1+op1+op2+op3+op4;
    }
}
