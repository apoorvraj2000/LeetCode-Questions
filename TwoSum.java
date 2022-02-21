package AllCodes;
import java.util.*;
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                ans[0]=map.get(rem);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }

}
