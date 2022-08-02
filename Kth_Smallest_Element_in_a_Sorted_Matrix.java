package AllCodes;

import java.util.PriorityQueue;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
	 public int kthSmallest(int[][] matrix, int k) {
	        PriorityQueue<Integer>pq=new  PriorityQueue<>();
	        
	        for(int i=0;i<matrix.length;i++)
	            for(int j=0;j<matrix[0].length;j++)
	                pq.add(matrix[i][j]);
	        
	        while(k>1){
	            pq.poll();
	            k--;
	        }
	        
	        return pq.poll();
	    }
}
