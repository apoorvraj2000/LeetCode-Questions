package AllCodes;

import java.util.HashMap;

public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {

	public boolean hasAllCodes(String s, int k) {
	       HashMap<String,Integer>map=new HashMap<>();
	        for(int i=0;i<s.length()-k+1;i++){
	            String curr=s.substring(i,k+i);
	            if(map.containsKey(curr)){
	                map.put(curr,map.get(curr)+1);
	            }else{
	                map.put(curr,1);
	            }
	        }
	        if(map.size()>=Math.pow(2,k))
	            return true;
	        
	        return false;
	    }
}
