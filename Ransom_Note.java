package AllCodes;

import java.util.*;

public class Ransom_Note {
	public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            
        }
        
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            
             if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }
        }
        for(char i:map.keySet()){
            if(map.get(i)>0)
                return false;
        }
        return true;
    }
}
