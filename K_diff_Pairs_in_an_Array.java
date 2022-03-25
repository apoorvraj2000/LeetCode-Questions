package AllCodes;

import java.util.*;

public class K_diff_Pairs_in_an_Array {

	public int findPairs(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int count=0;
        if(k==0){
            for(int i:map.keySet()){
                if(map.get(i)>1)
                    count++;
            }
        }else{
            for(int i:map.keySet()){
                int req=i-k;
                if(map.containsKey(req)){
                    count++;
                }
            }
        }
      return count;  
    }
}
