package AllCodes;

import java.util.Arrays;

public class Binary_Trees_With_Factors {
	 public int numFactoredBinaryTrees(int[] arr) {
	        int mod=1000000007;
	        Arrays.sort(arr);
	        long dp[]=new long[arr.length];
	        dp[0]=1;
	        int ans=0;
	        for(int i=1;i<arr.length;i++){
	            int target=arr[i];
	            
	            int left=0;
	            int right=i-1;
	            
	            long ways=1L;
	            
	            while(left<=right){
	                long currProd=(((long) arr[left])*(arr[right]));
	                
	                if(currProd==target){
	                    if(left==right){
	                        ways+=(dp[left]*dp[right])%mod;
	                    }else{
	                        ways+=(dp[left]*dp[right]*2)%mod;
	                    }
	                    left++;
	                    right--;
	                }else if(currProd<target){
	                    left++;
	                }else if(currProd>target){
	                    right--;
	                }     
	            }
	            dp[i]=ways;
	            ans=(int)((ans+dp[i])%mod);
	        }
	        return ans+1;
	    }
}
