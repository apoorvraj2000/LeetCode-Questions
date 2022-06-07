package AllCodes;

import java.util.*;

public class Combination_Sum_II {
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        
	        List<List<Integer>> ans=new LinkedList<>();
	        Arrays.sort(candidates); 
	        helper(candidates,target,0,ans,new LinkedList<>());
	        
	        return ans;
	    }
	    
	    public void helper(int[] arr,int t,int ind,List<List<Integer>> ans, List<Integer> store){
	        if(ind==arr.length){
	            if(t==0){
	                ans.add(new LinkedList<>(store));
	            }
	            return;
	        }
	      
	        if(arr[ind]<=t){
	            //Taking current element
	            store.add(arr[ind]);
	            helper(arr,t-arr[ind],ind+1,ans,store);
	          
	            //to remove duplicates   
	         while(ind+1<arr.length && arr[ind]==arr[ind+1])
	            ind++;
	            
	             //Backtracking
	             store.remove(store.size()-1);
	        }
	       
	        //not taking current element
	        helper(arr,t,ind+1,ans,store);
	        return;
	    }
}
