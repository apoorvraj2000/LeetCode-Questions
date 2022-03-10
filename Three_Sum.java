package AllCodes;
import java.util.*;
public class Three_Sum {

  public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++) {
        	int j=i+1;
        	int k=nums.length-1;
        	while(j<k) {
        		if((nums[i]+nums[j]+nums[k])==0) {
        			List<Integer>pair=new ArrayList<>();
        			pair.add(nums[i]);
        			pair.add(nums[j]);
        			pair.add(nums[k]);
        			ans.add(pair);
        			j++;
        			k--;
        		}
        		else if((nums[i]+nums[j]+nums[k])<0){
        			//if sum is less than 0
        			j++;
        		}else {
        			//if sum is greater than 0
        			k--;
        		}
        		
        	}
        }
        
        return new ArrayList<>(ans);
    }
}
