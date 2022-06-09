package AllCodes;

public class Two_Sum_II_Input_Array_Is_Sorted {
	 public int[] twoSum(int[] nums, int target) {
		 	//use two pointer approach to solve this
		 
		 	//starting index of array
	        int si=0;
	        //end index of array
	        int ei=nums.length-1;
	        //array to store ans
	        int ans[]=new int[2];
	        
	        while(si<ei){
	        	//current sum 
	            int currSum=nums[si]+nums[ei];
	            //if current sum is less than target
	            if(currSum<target){
	            	//so increase the start index
	                si++;
	            }//if current sum is greater than target
	            else if(currSum>target){
	            	//so decrease the end index
	                ei--;
	            }
	            else{
	            	//if current sum is equal to target
	            	//store ans and return
	                ans[0]=si+1;
	                ans[1]=ei+1;
	                break;
	            }
	        }
	        return ans;
	    }
}
