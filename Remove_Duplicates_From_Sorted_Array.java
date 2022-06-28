package AllCodes;

public class Remove_Duplicates_From_Sorted_Array {
	public int removeDuplicates(int[] nums) {
	    int j=1;
	    int n=nums.length;
	        for(int i=1;i<n;i++){
	            if(nums[i]==nums[i-1]){
	                continue;
	            }else{
	                nums[j]=nums[i];
	                j++;
	            }
	        }
	        
	        return j;
	    }
}
