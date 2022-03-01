package AllCodes;
import java.util.*;
public class Letter_Combinations_of_a_PhoneNumber {

	public List<String> letterCombinations(String digits) {
	       if(digits.length()==0){
	            return new LinkedList<>();
	        }
	        
	       List<String>ans=getResult(digits);
	        return ans;
	    }
	    public List<String> getResult(String digits) {
	        if(digits.length()==0){
	            List<String>ans=new LinkedList<>();
	            ans.add("");
	            return ans;
	        }
	        
	        //Curent Character
	        char currChar=digits.charAt(0);
	        
	        //Recursive Call
	        List<String>smallAns=getResult(digits.substring(1));
	        
	        //Code
	        String code=helper(Character.getNumericValue(currChar));
	        
	        List<String>ans=new LinkedList<>();
	        
	        for(int i=0;i<code.length();i++){
	            for(int j=0;j<smallAns.size();j++){
	                String toAdd=code.charAt(i)+smallAns.get(j);
	                ans.add(toAdd);
	            }
	        }
	        return ans;
	    }
	        
	    public String helper(int n){
			String s="";
			if(n==2)
	           s= "abc";
	  
	        if(n==3)
	        	s= "def";
	      
	        if(n==4)
	        	s= "ghi";
	       
	        if(n==5)
	        	s= "jkl";
	       
	        if(n==6)
	        	s= "mno";
	         
	        if(n==7)
	            s= "pqrs";
	  
	        if(n==8)
	             s= "tuv";
	     
	        if(n==9)
	             s= "wxyz";
	      
	        return s;
		}
	
}
