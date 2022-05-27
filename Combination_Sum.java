package AllCodes;

import java.util.*;

public class Combination_Sum {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>>ans=new LinkedList<>();
	        List<Integer>container=new LinkedList<>();

	        helper(candidates,0,target,ans,container);
	        
	        return ans;
	    }
	    public void helper(int[] arr, int ind, int t, List<List<Integer>>ans, List<Integer>container){
	        if(ind==arr.length){
	            if(t==0){
	                ans.add(new LinkedList<>(container));
	            }
	                return;
	        }
	        boolean flag=false;
	        //Condition to pick current element
	        if(arr[ind]<=t){
	            container.add(arr[ind]);
	            flag=true;
	            helper(arr,ind,t-arr[ind],ans,container);
	        }
	        if(flag){
	            container.remove(container.size()-1);
	        }
	        //Not pick the current element
	        helper(arr,ind+1,t,ans,container);
	        
	    }
}
