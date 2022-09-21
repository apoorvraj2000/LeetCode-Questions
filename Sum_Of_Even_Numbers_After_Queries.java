package AllCodes;

public class Sum_Of_Even_Numbers_After_Queries {
	public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int ans[]=new int[queries.length];
        int sum=0;
        
        for(int i : nums){
            if(i%2==0)
                sum+=i;
        }
        
        for(int i=0;i<queries.length;i++){
            int toAdd=queries[i][0];
            int ind=queries[i][1];
            
            if(nums[ind]%2==0){
                sum=sum-nums[ind];
            }
            
            nums[ind]=nums[ind]+toAdd;
            
            if(nums[ind]%2==0){
                sum=sum+nums[ind];
            }
            ans[i]=sum;
        }
        return ans;
  }
}
