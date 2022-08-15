package AllCodes;

import java.util.*;

public class Find_All_Duplicates_in_an_Array {
	//O(n) and O(1)
	 public List<Integer> findDuplicate(int[] nums) {
	        List<Integer> list = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				int n=Math.abs(nums[i])-1;
				if (nums[n] < 0) {
					list.add(n+1);
				} else {
					nums[n] = -nums[n];
				}
			}
			return list;
	    }
	
	//O(n) and O(n)
	public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int []freq=new int[n+1];
        for(int i:nums){
            freq[i]++;
        }
        List<Integer>ans=new LinkedList<>();
        for(int i=0;i<=n;i++){
            if(freq[i]>1){
                ans.add(i);
            }
        }
        return ans;
    }
}
