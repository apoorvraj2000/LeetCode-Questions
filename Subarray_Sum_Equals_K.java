package AllCodes;

import java.util.*;

public class Subarray_Sum_Equals_K {
	 public int subarraySum(int[] nums, int k) {
	        int sum=0;
	        int count=0;
	        
	        Map<Integer,Integer>map=new HashMap<>();
	        for(int i:nums){
	            sum+=i;
	            
	            if(sum==k){
	                count++;
	            }
	            if(map.containsKey(sum-k)){
	                count+=map.get(sum-k);
	            }
	            
	            if(map.containsKey(sum)){
	                map.put(sum,map.get(sum)+1);
	            }else{
	                map.put(sum,1);
	            }
	        }
	        return count;
	    }
}
