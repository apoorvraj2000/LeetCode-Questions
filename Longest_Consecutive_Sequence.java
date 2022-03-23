package AllCodes;

import java.util.*;

public class Longest_Consecutive_Sequence {

	public int longestConsecutive(int[] arr) {
        
        Map<Integer,Boolean>map=new HashMap<>();
        
		for(int i=0;i<arr.length;i++){
        	map.put(arr[i],true);    
        }
        int maxLength = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])){
                 int length=0;
              	 int temp1=arr[i];
                while(map.containsKey(temp1)){
                    length++;
                    map.put(temp1,false);
                    temp1++;
                }
                int temp2=arr[i]-1;
                while(map.containsKey(temp2)){
                    length++;
                    map.put(temp2,false);
                    temp2--;
                }
                
                if(length>maxLength){
                    maxLength=length;
                }
            }
        }
        return maxLength;
    }
}
