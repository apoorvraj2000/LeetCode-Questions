package AllCodes;

import java.util.*;

public class Minimum_Deletions_To_Make_Character_Frequencies_Unique {
	 public int minDeletions(String s) {
	        Map<Character,Integer>map=new HashMap<>();
	        //add the Character in map along with its frequency
	        for(int i=0;i<s.length();i++){
	            if(map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),map.get(s.charAt(i))+1);
	            }else{
	                map.put(s.charAt(i),1);
	            }
	        }
	        //Deletion count
	        int count=0;
	        //set to store the frequencies
	        Set<Integer>set=new HashSet<>();
	        for(char ch:map.keySet()){
	            int freq=map.get(ch);
	            //if current frequency is not present in set add it no need to delete any char
	            if(set.contains(freq)==false){
	                set.add(freq);
	            }
	            else{
	                //if frequency is already present the run a loop until that frequency is present in set
	                //ans is >0
	                //ans increase the count
	                while(freq>0 && set.contains(freq)){
	                    freq--;
	                    count++;
	                }
	            }
	            //if remaining freq is >0 then add it in set
	            if(freq>0){
	                set.add(freq);
	            }
	        }
	        return count;
	    }
}
