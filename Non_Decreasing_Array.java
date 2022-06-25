package AllCodes;

public class Non_Decreasing_Array {
	public boolean checkPossibility(int[] nums) {
    
        int modification=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
               modification++;
            }
            if(i-2>=0 && i+1<n){
                if(nums[i-2]>nums[i] && nums[i-1]>nums[i+1])
                    return false;
            }
            if(modification>1)
                return false;
        }
        return true;
    }
}
