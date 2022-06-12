package AllCodes;

import java.util.*;

public class Maximum_Erasure_Value {
	 public int maximumUniqueSubarray(int[] nums) {
	        int max=0;
	        Set<Integer>set=new HashSet<>();
	        int i=0,j=0;
	        int currSum=0;
	        while(j<nums.length){
	            if(set.contains(nums[j])){
	                while(nums[i]!=nums[j]){
	                    currSum-=nums[i];
	                    set.remove(nums[i]);
	                    i++;
	                }
	                i++;
	            }else{
	                currSum+=nums[j];
	                set.add(nums[j]);
	                max=Math.max(currSum,max);
	            }
	            j++;
	        }
	        return max;
	    }
	}
