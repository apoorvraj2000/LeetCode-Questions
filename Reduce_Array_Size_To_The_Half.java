package AllCodes;
import java.util.*;
public class Reduce_Array_Size_To_The_Half {
	public int minSetSize(int[] arr) {
	       Map<Integer,Integer>map=new HashMap<>();
	        
	        for(int i:arr){
	            if(map.containsKey(i)){
	                map.put(i,map.get(i)+1);
	            }else{
	                map.put(i,1);
	            }
	        }
	        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	        for(int i:map.keySet()){
	            pq.add(map.get(i));
	        }
	        
	        int size=arr.length;
	        int removedSize=0;
	        int count=0;
	        while(!pq.isEmpty()){
	            removedSize+=pq.poll();
	            count++;
	            if(removedSize>=size/2)
	                break;
	        }
	        
	        return count;
	    }
}
