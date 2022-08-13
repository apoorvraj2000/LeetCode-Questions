package AllCodes;

import java.util.*;

public class Substring_With_Concatenation_of_All_Words {
	public List<Integer> findSubstring(String s, String[] words) {
        Map<String ,Integer>map=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(String str:words){
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        int wLength=words[0].length();
        for(int i=0 ; i<=s.length()-wLength*words.length ; i++){
             Map<String ,Integer>copyMap=new HashMap<String, Integer>(map);
            
            for(int j=0 ; j<words.length ; j++){
                 String str = s.substring(i + j*wLength, i + j*wLength + wLength);
                if (copyMap.containsKey(str)) { 
                int count = copyMap.get(str);
                if (count == 1)
                    copyMap.remove(str);
                else 
                    copyMap.put(str, count - 1);
                if (copyMap.isEmpty()) { 
                    ans.add(i);
                    break;
                }
              }
              else 
                  break;
            }
        }
        return ans;
    }
}
