package AllCodes;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(map.containsKey(key)){
                    // get to the existing chracter position 
                    i=map.get(key);
                
                    // Reset HashMap
                    map.clear();
                    // Reset count
                    count=0;
            }else{
                //case of no repeating character
                map.put(key,i);
                count++;
            }
           ans=Math.max(ans,count);
        }
        return ans;
    }
}
