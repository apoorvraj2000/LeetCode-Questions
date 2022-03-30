package AllCodes;

public class Minimum_Deletions_To_Make_Array_Beautiful {
	public int minDeletion(int[] nums) {
        int deleted=0;
        for(int i=0;i<nums.length-1;i++){
            int ind=i-deleted;
            if(ind%2==0){
                if(nums[i]==nums[i+1]){
                    deleted++;
                }
            }
        }
        
        if((nums.length-deleted)%2!=0)
            deleted++;
        
        return deleted;
    }
}
