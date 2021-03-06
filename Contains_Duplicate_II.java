package AllCodes;

import java.util.*;

public class Contains_Duplicate_II {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int a=map.get(nums[i]);
                int b=i;
                
                if(Math.abs(a-b)<=k)
                    return true;
                
            }
             map.put(nums[i],i);
        }
        return false;
    }
}
