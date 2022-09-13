package AllCodes;

import java.util.*;

public class Rings_And_Rods {
	public int countPoints(String rings) {
        Map<Character,String>map=new HashMap<>();
       for(int i=1;i<rings.length();i+=2){
           if(map.containsKey(rings.charAt(i))){
               if(!map.get(rings.charAt(i)).contains(Character.toString(rings.charAt(i-1))))
                  map.put(rings.charAt(i),map.get(rings.charAt(i))+rings.charAt(i-1));
           }else{
               map.put(rings.charAt(i),Character.toString(rings.charAt(i-1)));
           }
       }
        int count=0;
        for(char c:map.keySet()){
            String curr=map.get(c);
            if(curr.length()==3)
                count++;
        }
        return count;
    }
}
