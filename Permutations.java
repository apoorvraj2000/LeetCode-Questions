package AllCodes;

import java.util.*;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new LinkedList<>();
        helper(nums,new LinkedList<>(),ans);
        return ans;
    }
    public void helper(int []nums,List<Integer>store,List<List<Integer>>ans){
        //base case
        if(store.size()==nums.length){
            ans.add(new LinkedList<>(store));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
        	//if already present in store then skip the current element
            if(store.contains(nums[i]))
                continue;
            
            //if not present in sore then add current element
            store.add(nums[i]);
            //recursive call
            helper(nums,store,ans);
            //Backtracking
            store.remove(store.size()-1);
        }
        
    }
}
