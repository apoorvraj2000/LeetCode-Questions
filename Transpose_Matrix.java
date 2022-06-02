package AllCodes;

public class Transpose_Matrix {

	public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] ans = new int[col][row];
        
        for (int r = 0; r < row; ++r)
            for (int c = 0; c < col; ++c) {
                ans[c][r] = matrix[r][c];
            }
        return ans;
    }
}
