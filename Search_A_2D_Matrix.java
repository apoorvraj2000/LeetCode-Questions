package AllCodes;

public class Search_A_2D_Matrix {

	public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int si=0;
            int ei=matrix[i].length-1;
            while(si<=ei){
                int mid=ei-si/2;
                if(matrix[i][mid]==target)
                    return true;
                if(matrix[i][mid]<target)
                    si=mid+1;
                else
                    ei=mid-1;
            }
        }
        return false;
    }
}
