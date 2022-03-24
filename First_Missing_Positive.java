package AllCodes;

public class First_Missing_Positive {

	public int firstMissingPositive(int[] nums) {
        boolean onePresent=false;
        //Mark all the elements which are out of range and check presence of one
        for(int i=0;i<nums.length;i++){
            //Checking presence
            if(nums[i]==1)
                onePresent=true;
            //marking elements
            if(nums[i]<1 ||nums[i]>nums.length){
                nums[i]=1;
            }
        }
        
        //if one is not present return one
        if(!onePresent)
            return 1;
        
        //Map the element with index
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            
            nums[index-1]=-Math.abs(nums[index-1]);
        }
        
        //find out the missing positive integer
        for(int i=0;i<nums.length;i++){
            //if element at current index is positive then return index+1
            if(nums[i]>0){
                return i+1;
            }
        }
        
        //if every integer is present then return length of array+1
        return nums.length+1;
    }
}
