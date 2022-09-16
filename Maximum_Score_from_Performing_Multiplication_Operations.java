package AllCodes;

import java.util.Arrays;

public class Maximum_Score_from_Performing_Multiplication_Operations {
	 public int maximumScore(int[] nums, int[] multi) {
	        int n = nums.length;
	        int m = multi.length;
	        int[][]  memo= new int[m + 1][m + 1];
	        
	        for(int []a:memo){
	            Arrays.fill(a,Integer.MIN_VALUE);
	        }
	        
	        return helper(0,0,nums,multi,memo);
	    }
	    
	    public int helper(int i, int j, int[] nums, int[] multi, int[][] memo){
	        if(i==multi.length)
	            return 0;
	        
	        if(memo[i][j]!=Integer.MIN_VALUE)
	            return memo[i][j];
	        
	        //Take from left
	        int left=multi[i]*nums[j]+helper(i+1,j+1,nums,multi,memo);
	        
	        //Take from right
	        int right=multi[i]*nums[nums.length-1 -(i-j)]+helper(i+1,j,nums,multi,memo);
	        
	        //store the max
	        memo[i][j]=Math.max(left,right);
	        
	        return memo[i][j];
	    }
}
