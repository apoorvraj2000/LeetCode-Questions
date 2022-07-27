package AllCodes;

import java.util.Arrays;

public class Coin_Change {
	
	//Optimal Solution
	  public int coinChanges(int[] coins, int amount) {
		     
	        int dp[]=new int[amount+1];
	        
	        Arrays.fill(dp,-1);
	        
	        dp[0]=0;
	        
	        int ans=helper(amount,coins,dp);
	        
	        return (ans!=Integer.MAX_VALUE)?ans:-1;
	    }
	    int helper(int n, int a[], int dp[]) {
			
			if(n == 0) return 0;
			
			int ans = Integer.MAX_VALUE;
			
			for(int i = 0; i<a.length; i++) {
				if(n-a[i] >= 0) {
					int subAns = 0;
					if(dp[n-a[i]] != -1) {
						subAns = dp[n-a[i]];
					} else {
						subAns = helper(n-a[i], a, dp);
					}
					if(subAns != Integer.MAX_VALUE && 
							subAns + 1 < ans) {
						ans = subAns + 1;
					}
				}
			}
			return dp[n] = ans;
		}
	
	//Brute force
   public int coinChange(int[] coins, int amount) {
        
        
        int ans=helper(coins,0,amount,0,Integer.MAX_VALUE);
        
        return (ans!=Integer.MAX_VALUE)?ans:-1;
    }
    public int helper(int[] arr,int ind, int amt,int cn, int min){
        if(amt==0){
            min=Math.min(cn,min);
            return min;
        }
        if(ind==arr.length)
            return Integer.MAX_VALUE;
        
        if(arr[ind]<=amt){
            int op1=helper(arr,ind,amt-arr[ind],cn+1,min);
             min=Math.min(op1,min);
        }
        
        int op2=helper(arr,ind+1,amt,cn,min);
         min=Math.min(op2,min);
        
        return min;
    }
}
