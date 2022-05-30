package AllCodes;

public class Stone_Game {
	
	public boolean stoneGame(int[] piles) {
        // As we know that sum of stones in piles is odd. 
		// If the sum of piles[even] is greater than the sum of piles[odd], Player Alice just picks all evens and wins. 
		// If the sum of piles[even] is less than the sum of piles[odd], Player Alice just picks all odds and wins. 
		// So, Player Alice is always the winner in this game
        return true;
    }
	
	//memoization Solution
	public boolean stoneGameM(int[] piles) {
        int[][] dp = new int[piles.length+1][piles.length+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp.length;j++)
                dp[i][j]=-1;
        
        return helperM(piles,0,piles.length-1,true,dp)>0;
    }
    
    public int helperM(int[] piles, int first, int last, boolean player, int[][] dp)
    {
        int val=1;
        if(first>last)
            return 0;
        
        if(!player)
            val = -1;
        
        if(dp[first][last]!=-1)
            return dp[first][last];
        
        int ftotal = val* piles[first]  + helperM(piles,first+1,last,!player,dp);
        
        int etotal  = val * piles[last]  + helperM(piles,first,last-1,!player,dp);
        
        dp[first][last] = Math.max(ftotal,etotal);
        return dp[first][last];
    }
	
	//Recursive Solution
	 public boolean stoneGameR(int[] piles) {
	        return helperR(piles,0,0,0,piles.length-1);
	    }
	    private boolean helperR(int[] arr, int alex, int bob, int i, int j) {
		    if(i>=j || i>=arr.length || j<0){
	            return alex>bob;
	        }
	        
	        //alex taking stone at first index
	        boolean op1=helperR(arr,alex+arr[i],bob+arr[j],i+1,j-1);
	        
	        //alex is taking stone at last index
	        boolean op2=helperR(arr,alex+arr[j],bob+arr[i],i+1,j-1);
	        
	        return op1||op2;
	  }
}
