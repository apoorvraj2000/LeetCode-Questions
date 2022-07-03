package AllCodes;

import java.util.*;

public class Palindrome_Partitioning {
	 public List<List<String>> partition(String s) {
	        List<List<String>> ans=new ArrayList<>();
	        helper(s,new ArrayList<>(),ans);
	        return ans;
	    }
	    private void helper(String s,List<String> curr,List<List<String>>ans){
	        //Base case
	        if(s.length()==0){
	            if(curr.size()>0){
	                ans.add(new ArrayList<>(curr));
	            }    
	            return;   
	        }
	        //checking for all the substrings
	        for(int i=0;i<s.length();i++){
	            //current substring
	            String st=s.substring(0,i+1);
	            //check if it is palindrome
	            if(isPalin(st)){
	                //if yes then add it in current
	                curr.add(st);
	                //recursive call
	                helper(s.substring(i+1),curr,ans);
	                //backtracking
	                curr.remove(curr.size()-1);
	            }
	        }
	        return;
	    }
	    
	    private boolean isPalin(String s){
	        int i=0;
	        int j=s.length()-1;
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
}
