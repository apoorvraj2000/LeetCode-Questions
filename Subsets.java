package AllCodes;

import java.util.*;

public class Subsets {

	 public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>>ans=new LinkedList<>();
	        helper(nums,0,new LinkedList<>(),ans);
	        return ans;
	    }
	    public void helper(int[]nums,int ind,List<Integer>store,List<List<Integer>>ans){
	        //Base case
	        if(ind==nums.length){
	            ans.add(new LinkedList<>(store));
	            return;
	        }
	        
	        //in case of taking the current element
	        
	        //Add current element in store
	        store.add(nums[ind]);
	        //Recursive Call
	        helper(nums,ind+1,store,ans);
	        
	         //in case of not taking the current element
	        
	        //BackTracking
	        store.remove(store.size()-1);
	        //Recursive Call
	        helper(nums,ind+1,store,ans);
	    }
}
