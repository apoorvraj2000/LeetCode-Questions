package AllCodes;

import java.util.*;

public class Unique_Morse_Code_Words {
	 public int uniqueMorseRepresentations(String[] words) {
	        
	        String code[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        Set<String>ans=new HashSet<>();
	        for(String str : words){
	            String c="";
	            for(int i=0;i<str.length();i++){
	                int ind=(int)str.charAt(i);
	                
	                c+=code[ind-'a'];
	                
	            }
	            ans.add(c);
	        }
	        
	        return ans.size();
	    }
}
