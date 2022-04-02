package AllCodes;

import java.util.*;

public class Reorganize_String {
	public String reorganizeString(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	if(map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}else {
        		map.put(s.charAt(i), 1);
        	}
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        
        String ans="";
        while(pq.size()>1) {
            //get largest and second largest freq char
        	char first=pq.poll();
        	char second=pq.poll();
        	//decrease the freq by 1 in hashmap
        	map.put(first, map.get(first)-1);
        	map.put(second, map.get(second)-1);
        	//append to ans string
        	ans+=first;
        	ans+=second;
        	//if still freq is left for that char then add it back to pq
        	if(map.get(first)>0)
        		pq.add(first);
        		
        	if(map.get(second)>0)
            	pq.add(second);
        }
        //now when only 1 char are left in pq
        if(!pq.isEmpty()) {
        	char ch=pq.poll();
        	 //if that char has freq more than 1 then is it not possible 
        	if(map.get(ch)>1)
        		return "";
        	 //else
        	ans+=ch;
        }
       return ans;
    }

}
