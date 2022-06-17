package AllCodes;

public class Word_Search {

	 public boolean exist(char[][] board, String word) {
	        int m=board.length;
	        int n=board[0].length;
	        
	        boolean visited[][]=new boolean[m][n];
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(board[i][j]==word.charAt(0) && helper(word,0,board,i,j,visited)){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    public boolean helper(String s,int ind, char[][] board,int r,int c,boolean[][]visited){
	        if(ind==s.length())
	            return true;
	        
	        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=s.charAt(ind) ||                 visited[r][c]==true){
	            return false;
	        }
	        
	        visited[r][c]=true;
	        //Check Up , Down, Left and Right 
	        if(helper(s,ind+1,board,r-1,c,visited)||
	          helper(s,ind+1,board,r+1,c,visited)||
	          helper(s,ind+1,board,r,c-1,visited)||
	          helper(s,ind+1,board,r,c+1,visited))
	        return true;
	        
	        visited[r][c]=false;
	        
	        return false;
	        
	    }
}
