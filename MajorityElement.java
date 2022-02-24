package AllCodes;

import java.util.*;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
	        int count=1;
	        int majorElement=nums[0];
	        for(int i=1;i<nums.length;i++){
	            if(count==0){
	                majorElement=nums[i];
	                count++;
	            }
	            else if(majorElement==nums[i])
	                count++;
	            else
	                count--;
	        }
	        
	        return majorElement; 
	    }
}
