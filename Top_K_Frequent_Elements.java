package AllCodes;

import java.util.*;

public class Top_K_Frequent_Elements {
	
	public int[] topKFrequent(int[] nums, int k) {
        //build hash map of given value and its frequency
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        //the less frequent element first in heap
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        //keep only k top frequent elements in the heap
        for(int i:map.keySet()){
            pq.add(i);
            
            if(pq.size()>k)
                pq.poll();
        }
	   
        int ans[]=new int[k];
        //build an output array
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}
