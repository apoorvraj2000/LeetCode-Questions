package AllCodes;

import java.util.*;

public class Jewels_And_Stones {
	 public int numJewelsInStones(String jewels, String stones) {
	        int ans=0;
	        Map<Character,Integer>map=new HashMap<>();
	        for(int i=0;i<stones.length();i++){
	            if(map.containsKey(stones.charAt(i))){
	                map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
	            }else{
	                map.put(stones.charAt(i),1);
	            }
	        }
	        for(int i=0;i<jewels.length();i++){
	             if(map.containsKey(jewels.charAt(i))){
	                 ans+=map.get(jewels.charAt(i));
	             }
	        }
	        return ans;
	    }
}
