package AllCodes;

public class Partition_Array_According_To_Given_Pivot {

	public int[] pivotArray(int[] nums, int pivot) {
        int less=0;
        int equal=0;
        int greater=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less++;
            }else if(nums[i]>pivot){
                greater++;
            }else{
                equal++;
            }
        }
        int lessIndex=0;
        int equalIndex=less;
        int greaterIndex=less+equal;
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[lessIndex]=nums[i];
                lessIndex++;
            }else if(nums[i]>pivot){
                ans[greaterIndex]=nums[i];
                greaterIndex++;
            }else{
                ans[equalIndex]=nums[i];
                equalIndex++;
            }
        }
        return ans;
        
    }
}
