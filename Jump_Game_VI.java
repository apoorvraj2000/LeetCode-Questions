package AllCodes;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Jump_Game_VI {
	//Optimize
	 public int maxResult(int[] nums, int k) {
	        
	        Deque<Integer> dq= new LinkedList<>();
	         dq.addFirst(0);
	        
	        for(int i=1;i<nums.length;i++){
	            
	            if(dq.peekFirst()+k<i){
	                dq.pollFirst();
	            }
	            
	            nums[i] += nums[dq.peekFirst()];
	            
	            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i])
	                dq.pollLast();
	            
	            dq.addLast(i);
	        }
	        return nums[nums.length-1];
	    }
	 
	//Memoization Approach
	public int maxResultM(int[] nums, int k) {
        int memo[]=new int[nums.length];
        Arrays.fill(memo,Integer.MIN_VALUE);
        return helper(nums,0,k,memo);
    }
    public int helper(int nums[],int ind,int k,int[]memo){
        if(ind>=nums.length)
            return 0;
        
        if(ind==nums.length-1){
            memo[ind]=nums[ind];
            return memo[ind];
        }
        
        if(memo[ind]!=Integer.MIN_VALUE)
            return memo[ind];
        
        int max=Integer.MIN_VALUE/2;
        
        for(int i=ind+1;i<=Math.min(ind+k,nums.length-1);i++){
          max= Math.max(max,nums[ind]+helper(nums,i,k,memo));
        }
        
        memo[ind]=max;
        return memo[ind];
    }
	
	//Recursion Approach
	 public int maxResultt(int[] nums, int k) {
	        
	        return helper(nums,0,k);
	    }
	    public int helper(int nums[],int ind,int k){
	        if(ind>=nums.length)
	            return 0;
	        
	        if(ind==nums.length-1)
	            return nums[ind];
	        
	        int max=Integer.MIN_VALUE/2;
	        
	        for(int i=ind+1;i<=Math.min(ind+k,nums.length-1);i++){
	          max= Math.max(max,nums[ind]+helper(nums,i,k));
	        }
	        
	        return max;
	    }
}
