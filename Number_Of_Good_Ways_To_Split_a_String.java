package AllCodes;

import java.util.*;
public class Number_Of_Good_Ways_To_Split_a_String {

	 public int numSplits(String s) {
	        Set<Character> store = new HashSet<>();
			int len=s.length();
	        
	        int forwardDistinct[]=new int[len];
	        int backwardDistinct[]=new int[len];
	        
	        for(int i=0;i<len;i++){
	            store.add(s.charAt(i));
	            
	            forwardDistinct[i]=store.size();
	        }
	        store.clear();
	        
	        for(int i=len-1;i>=0;i--){
	            store.add(s.charAt(i));
	            
	            backwardDistinct[i]=store.size();
	        }
	        
	        int i=0;
	        int j=1;
	        int ans=0;
	        
	        while(i<len && j<len){
	            if(forwardDistinct[i]==backwardDistinct[j])
	                ans++;
	            
	            i++;
	            j++;
	        }
		     
		   return ans;
	    }

}
