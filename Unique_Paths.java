package AllCodes;

public class Unique_Paths {
	//Memoization Solution
	 public int uniquePath(int m, int n) {
	       int path[][]=new int[m][n];
	    for(int i=0;i<m;i++)
	        for(int j=0;j<n;j++)
	            path[i][j]=-1;
	        return helpers(path,0,0,m,n);
	    }
	    public int helpers(int path[][], int i, int j, int m, int n){
	        if(i>=m || j>=n){
	            return 0;
	        }
	            
	        if(i==m-1 && j==n-1){
	            path[i][j]=1;
	            return path[i][j];
	        }
	       
	        if(path[i][j]!=-1){
	            return path[i][j];
	        }
	        
	        int op1=0,op2=0;
	       //going down
	        op1+=helpers(path,i+1,j,m,n);
	       
	       //going right 
	        op2+=helpers(path,i,j+1,m,n);
	        path[i][j]=op1+op2;
	        
	         return path[i][j];
	    }
	
	//BruteForce Solution
	 public int uniquePaths(int m, int n) {
	       int path[][]=new int[m][n];
	        return helper(path,0,0,m,n);
	    }
	    public int helper(int path[][], int i, int j, int m, int n){
	        if(i>=m || j>=n)
	            return 0;
	        
	        if(i==m-1 && j==n-1)
	            return 1;
	       
	        int op1=0,op2=0;
	       //going down
	        op1+=helper(path,i+1,j,m,n);
	       
	       //going right 
	        op2+=helper(path,i,j+1,m,n);
	        
	        return op1+op2;
	    }
}
