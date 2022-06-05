package AllCodes;

public class N_Queens_II {

	public int totalNQueens(int n) {
		 //Create a board of length n X n
	     char[][]board=new char[n][n];
	     //call the function to get result
	     return solve(board,0);  

	    }
	    
	    public int solve(char[][]board, int col){
	    	//Base case if we already fill all the column
	        //which means we have an solution so return 1
	        if(col==board.length){
	            return 1;
	        }
	        int ans=0;
	       //try to place the queen in every row at a particular column
	        for(int row=0;row<board.length;row++){
	        	 //check can we place queen at current position or not
	            if(validate(board,row,col)){
	            	//If yes
	                //place the queen at current position
	                board[row][col]='Q';
	                //recursive call
	                ans+=solve(board,col+1);
	                //backtracking
	                board[row][col]= '\u0000';
	            }
	        }
	        //return ans
	        return ans;
	    }
	    
	    public boolean validate(char[][]board,int row,int col){
	        int tempRow=row;
	        int tempCol=col;
	        
	        //Checking diagonally upward in left
	        while(row>=0 && col>=0){
	            if(board[row][col]=='Q')
	                return false;
	            
	            row--;
	            col--;
	        }
	        
	        row=tempRow;
	        col=tempCol;
	        //Checking in left direction
	        while(col>=0){
	            if(board[row][col]=='Q')
	                return false;
	            
	            col--;
	        }
	        
	        row=tempRow;
	        col=tempCol;
	        //Checking diagonally downward in left
	         while (col >= 0 && row < board.length) {
	            if (board[row][col] == 'Q') 
	                  return false;
	            col--;
	            row++;
	        }
	        return true;
	    }
}
