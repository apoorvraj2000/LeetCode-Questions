package AllCodes;

import java.util.*;

public class Majority_Element_II {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/3)
                ans.add(i);
        }
        
        return ans;
    }
}
