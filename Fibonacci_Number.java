package AllCodes;

public class Fibonacci_Number {
	 public int fib(int n) {
	        if(n==0 ||n ==1)
	            return n;
	        int dp[]=new int[n+1];
	        dp[0]=0;
	        dp[1]=1;
	        int i=2;
	        while(i<=n){
	            dp[i]=dp[i-1]+dp[i-2];
	            i++;
	        }
	        return dp[n];
	    }
}
