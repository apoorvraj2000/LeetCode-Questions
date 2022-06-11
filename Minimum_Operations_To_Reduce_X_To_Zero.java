package AllCodes;

import java.util.*;

public class Minimum_Operations_To_Reduce_X_To_Zero {

	public int minOperations(int[] nums, int x) {
        int target=0;
        for(int i=0;i<nums.length;i++){
            target+=nums[i];
        }
        target-=x;
        
        if(target==0)
            return nums.length;
 
        //To store the prefix sum
        Map<Integer,Integer>map=new HashMap<>();
        //prefix sum
        int preSum=0;
        int result=-1;
        map.put(preSum,-1);
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            if(map.containsKey(preSum-target)){
                result=Math.max(result,i-map.get(preSum-target));
            }
            map.put(preSum,i);
        }
        if(result==-1)
            return -1;
        
        return nums.length-result;
    }
}
