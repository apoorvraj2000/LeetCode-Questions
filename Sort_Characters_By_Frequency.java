package AllCodes;
import java.util.*;
public class Sort_Characters_By_Frequency {
	 public String frequencySort(String s) {
	        Map<Character,Integer>map=new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            if(map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }else{
	                map.put(s.charAt(i),1);
	            }
	        }
	        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
	        for(char c : map.keySet()){
	            pq.add(map.get(c));
	        }
	        String ans="";
	        while(!pq.isEmpty()){
	            int val=pq.remove();
	            char ch=0;
	            for(char d : map.keySet()){
	                if(map.get(d) == val){
	                    ch = d;
	                    map.remove(d);
	                    break;
	                }
	            }
	            for(int i = 0; i <val; i++){
	                ans+= ch;
	            }
	        }
	        return ans;
	    }
}
