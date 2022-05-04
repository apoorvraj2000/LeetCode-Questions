package AllCodes;

import java.util.*;

public class Max_Number_Of_K_Sum_Pairs {
	 public int maxOperations(int[] nums, int k) {

	     Map<Integer,Integer>map=new HashMap<>();
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            int rem=k-nums[i];
	            
	            //check if that rem present and had some value left or already paired
	            if(map.containsKey(rem) && map.get(rem)>0){
	                count++;
	                map.put(rem,map.get(rem)-1);
	                
	            }else{
	                if(map.containsKey(nums[i])){
	                      map.put(nums[i],map.get(nums[i])+1);
	                }else{
	                    map.put(nums[i],1);
	                }
	            }
	        }
	        return count;
	    }
}
