package AllCodes;

import java.util.Arrays;

public class Shortest_Unsorted_Continuous_Subarray {
	 public int findUnsortedSubarray(int[] nums) {
	        int temp[]=nums.clone();
	        //Sort the array
	        Arrays.sort(temp);
	        int start=0, end=0;
	        //Find first misMatch
	        for(int i=0;i<nums.length;i++){
	           if(temp[i]!=nums[i]){
	               start=i;
	               break;
	           }
	        }
	        //Find last misMatch
	        for(int i=nums.length-1;i>=0;i--){
	           if(temp[i]!=nums[i]){
	               end=i;
	               break;
	           }
	        }
	        
	        if(end-start>0)
	            return end-start+1;
	        
	        return 0;
	    }
}
