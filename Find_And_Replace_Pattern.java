package AllCodes;

import java.util.*;

public class Find_And_Replace_Pattern {
	 public List<String> findAndReplacePattern(String[] words, String pattern) {
	        List<String>ans=new ArrayList<>();
	        for(String str:words){
	            if(check(str,pattern)){
	                ans.add(str);
	            }
	        }
	        return ans;
	    }
	    public boolean check(String word, String pat){
	        Map<Character,Character>patToword=new HashMap<>();
	        
	        Map<Character,Character>wordTopat=new HashMap<>();
	        
	        for(int i=0;i<word.length();i++){
	            char w=word.charAt(i);
	            char p=pat.charAt(i);
	            
	            if(!patToword.containsKey(p)){
	                patToword.put(p,w);
	            }
	            
	            if(!wordTopat.containsKey(w)){
	                wordTopat.put(w,p);
	            }
	            
	            if(patToword.get(p)!=w || wordTopat.get(w)!=p)
	                return false;
	        }
	        return true;
	    }
}
