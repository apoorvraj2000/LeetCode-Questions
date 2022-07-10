package AllCodes;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
	public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
        return ans;
    }
    public int helper(int[] cost,int i,int dp[]){
        if(i==0 || i==1)
            return cost[i];
        
        if(dp[i]!=-1)
            return dp[i];
        
        dp[i]=cost[i]+Math.min(helper(cost,i-1,dp),helper(cost,i-2,dp));
        
        return dp[i];
        
    }
}
