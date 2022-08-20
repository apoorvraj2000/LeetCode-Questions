package AllCodes;

import java.util.*;

public class Minimum_Number_of_Refueling_Stops {
	 public int minRefuelStops(int target, int startFuel, int[][] stations) {
	        
	        if(target<=startFuel)
	            return 0;
	        
	        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> b[1]-a[1]);
	        int count=0;
	        int i=0;
	        int curr=startFuel;
	        
	        while(curr<target){
	            while(i<stations.length && stations[i][0]<=curr){
	            
	            
	            pq.add(stations[i]);
	            i++;
	          }
	            
	            if(pq.isEmpty())  
	              return -1;
	        
	        curr +=pq.remove()[1];
	        count++;
	        }
	        return count;
	    }
}
