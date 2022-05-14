package AllCodes;

import java.util.*;

public class Count_Number_Of_Pairs_With_Absolute_Difference_K {

	public int countKDifference(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
       for(int i:nums){
           if(map.containsKey(i)){
               map.put(i,map.get(i)+1);
           }else{
               map.put(i,1);
           }
       }
        for(int i:nums){
             if(map.containsKey(i-k)){
                count+=map.get(i-k);
            }
        }
        return count;
    }
}
