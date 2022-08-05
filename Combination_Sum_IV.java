package AllCodes;

import java.util.Arrays;

public class Combination_Sum_IV {
	public int combinationSum4(int[] nums, int target) {
        int []memo=new int[target+1];
        
        Arrays.fill(memo,-1);
        Arrays.sort(nums);
        return helper(nums,target,memo);
        
    }
     public int helper(int[] nums, int target, int[]memo) {
        if(target==0){
             return 1;
        }
        
         if(memo[target]!=-1)
             return memo[target];
         
         int count=0;
         for(int i:nums){
             if(target-i<0)
                 break;
             
             count+=helper(nums,target-i,memo);
         }
         
         
         return memo[target]=count;
    }
}
