package AllCodes;

import java.util.*;

public class First_Unique_Character_in_a_String {
	public int firstUniqChar(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
               map.put(s.charAt(i),1);
            }
        }
         for(int i=0;i<s.length();i++){
             if(map.get(s.charAt(i))==1)
                 return i;
         }
        
        return -1;
    }
}
