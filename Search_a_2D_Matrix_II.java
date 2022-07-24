package AllCodes;

public class Search_a_2D_Matrix_II {
	//optimize solution
	 public boolean searchMatrix(int[][] matrix, int target) {
	       int m=matrix.length;
	        int n=matrix[0].length;
	        
	        if(m==0)
	            return false;
	        
	        int i=0;
	        int j=n-1;
	        
	        while(i<m && j>=0){
	            if(matrix[i][j]==target)
	                return true;
	            
	            if(matrix[i][j]>target)
	                j--;
	            else
	                i++;
	        }
	        return false;
	    }
	
	//Binary Search
	//O(m+log n)
	 public boolean searchMatrixB(int[][] matrix, int target) {
	        for(int a[]:matrix){
	            int si=0;
	            int ei=a.length-1;
	            
	            while(si<=ei){
	                int mid=(si+ei)/2;
	                
	                if(a[mid]==target)
	                    return true;
	                
	                else if(a[mid]<target)
	                    si=mid+1;
	                else if(a[mid]>target)
	                    ei=mid-1;
	            }
	        }
	        return false;
	    }
}
