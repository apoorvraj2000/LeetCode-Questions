package AllCodes;

public class Longest_Increasing_Subsequence {

	public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int lisLengths[]=new int[n];
        
        for(int i=0;i<n;i++){
            lisLengths[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int currLis=lisLengths[i];
                     int preLis=lisLengths[j]+1;
                    lisLengths[i]=Math.max(currLis,preLis);
                }
            }
        }
        
        int max=0;
        for(int i:lisLengths)
            max=Math.max(i,max);
        
        return max;
    }
}
