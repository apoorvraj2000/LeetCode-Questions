package AllCodes;

public class Sort_Array_By_Parity {

	public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[index]=nums[i];
                index++;
            }         
        }
        
        for(int i=0;i<n;i++){
             if(nums[i]%2!=0){
                ans[index]=nums[i];
                index++;
            }
        }
        
        return ans;
    }
}
