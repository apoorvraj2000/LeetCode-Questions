package AllCodes;

//Optimize by prefix sum
class NumMatrix {
	//create an array to store prefix sum
    private int mat[][];
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        mat=new int[n][m];
        
        //store the prefix sum into mat array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    mat[i][j]=matrix[i][j];
                }else{
                    mat[i][j]=matrix[i][j]+mat[i][j-1];
                }        
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int sum=0;
        
        for(int i=row1;i<=row2;i++){
            
            sum+=(mat[i][col2]-(col1>0?mat[i][col1-1]:0));
        }
        return sum;
    }
}

//Brute Force
class NumMatrixB {
	
    private int mat[][];
    public NumMatrixB(int[][] matrix) {
        mat=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int r=row1;r<=row2;r++){
            for(int c=col1;c<=col2;c++){
                sum+=mat[r][c];
            }
        }
        return sum;
    }
}

public class Range_Sum_Query_2D_Immutable {
		
}
