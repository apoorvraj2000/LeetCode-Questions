package AllCodes;

public class Remove_Duplicates_From_Sorted_Array_II {

	public int removeDuplicates(int[] nums) {
	       if(nums.length<3)
	           return nums.length;
	        
	        int count=2;
	        
	        for(int i=2;i<nums.length;i++){
	            if(nums[i]!=nums[count-2]){
	                nums[count++]=nums[i];
	            }
	        }
	        
	        return count;
	    }
}
