package AllCodes;
/*Approach:
 * 1. First create a temporary matrix. We will update all the values to this matrix.
1. Just loop through the matrix; at each cell, add sum of 
    all the 8 neighbors (consider out of bound cells as 0). used "liveNeighbors" variable for this.  
2. Then using the rules given in question, update the temporary matrix cells.
3. After the loop, copy all the temporary matrix values to original matrix "board".*/
public class Game_Of_Life {

	public void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;
        
        // we will first update values in this temporary matrix
        int updated[][]=new int[row][col];
        
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                //Total live neighbors
            int totalLN= liveNeighbors(board,r-1,c-1) + liveNeighbors(board,r-1,c) +                                        liveNeighbors(board,r-1,c+1) + liveNeighbors(board,r,c+1) + 
                    liveNeighbors(board,r+1,c+1) + liveNeighbors(board,r+1,c) +
                     liveNeighbors(board,r+1,c-1) + liveNeighbors(board,r,c-1);
                
             // update temporary matrix, based on the rules in question
                if(board[r][c]==1){
                    //for live Cell
                    if(totalLN<2){
                        updated[r][c]=0;
                    }
                    else if(totalLN==2 || totalLN==3){
                        updated[r][c]=1;
                    }
                    else if(totalLN>3){
                        updated[r][c]=0;
                    }
                }else{
                     //for dead Cell
                    if(totalLN==3){
                        updated[r][c]=1;
                    }
                }
            }
        }
        //copying updated array into original array
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                board[i][j]=updated[i][j];
            }
        }
        
    }
    public int liveNeighbors(int board[][],int r,int c){
        // out of bound cases
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]==0){
            return 0;
        }
        return 1;
    }
}
