package AllCodes;

import java.util.*;

public class Split_Array_Into_Consecutive_Subsequences {
	public boolean isPossible(int[] nums) {
        Map<Integer,Integer>freq=new HashMap<>();
        Map<Integer,Integer>last=new HashMap<>();
        
        // first pass, fill the freq map
        for(int i:nums){
            if(freq.containsKey(i)){
                freq.put(i,freq.get(i)+1);
            }else{
                freq.put(i,1);
            }
        }
        // second pass:
        for(int i:nums){
             // there is no such number available
            if(freq.get(i)==0)
                continue;
            else
               freq.put(i,freq.get(i)-1); 
            
            // if there is some subsequence that is ended with i - 1:
            // then we can put the number i in the subsequence
            if(last.containsKey(i-1) && last.get(i-1)>0){
                 // the number of sequence ended with i-1 decreases
                 last.put(i-1,last.get(i-1)-1); 
                // the number of sequences ended with i increases
                last.put(i,last.getOrDefault(i, 0) + 1);
            }
            // there is no such subsequence that is ended with i-1
            // we build a new subsequence start with i,
            else if((freq.containsKey(i+1) && freq.containsKey(i+2)) && 
                    (freq.get(i+1)!=0 && freq.get(i+2)!=0)){
                // if we have available i + 1 and i + 2
                // we now have one more subsequence ended with i+2
                freq.put(i+1,freq.get(i+1)-1);
                freq.put(i+2,freq.get(i+2)-1);
                
               
                 last.put(i+2,last.getOrDefault(i+2, 0) + 1);   
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
